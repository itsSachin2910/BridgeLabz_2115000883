class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }
    public void removeProcess(int processId) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                if (prev != null) prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    public void executeProcesses() {
        if (head == null) return;
        Process temp = head;
        int time = 0;
        while (true) {
            boolean allDone = true;
            Process current = temp;
            do {
                if (current.burstTime > 0) {
                    allDone = false;
                    int execTime = Math.min(timeQuantum, current.burstTime);
                    System.out.println("Executing Process ID: " + current.processId + " for " + execTime + " units.");
                    time += execTime;
                    current.burstTime -= execTime;
                }
                current = current.next;
            } while (current != temp);

            if (allDone) break;
        }
        System.out.println("All processes completed execution.");
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinSystem {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        System.out.println("\nStarting Round Robin Execution:");
        scheduler.executeProcesses();

        System.out.println("\nFinal Process Queue:");
        scheduler.displayProcesses();
    }
}

