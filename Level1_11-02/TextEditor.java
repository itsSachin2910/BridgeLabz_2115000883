class Node {
    String text;
    Node prev;
    Node next;

    public Node(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class HistoryManager {
    private Node head;
    private Node tail;
    private Node current;
    private int size;
    private final int MAX_SIZE;

    public HistoryManager(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.MAX_SIZE = maxSize;
    }

    // Add a new text state to the history
    public void addState(String text) {
        Node newNode = new Node(text);

        if (size == 0) {
            head = tail = current = newNode;
        } else {
            // Remove the forward history if we're at the end
            if (current.next != null) {
                current.next = null;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = tail;
        }

        // If history size exceeds MAX_SIZE, remove the oldest state (head)
        if (size == MAX_SIZE) {
            head = head.next;
            head.prev = null;
        } else {
            size++;
        }
    }

    // Undo: Move to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("No more undo history.");
        }
    }

    // Redo: Move to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("No more redo history.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.text);
        } else {
            System.out.println("No text state available.");
        }
    }
}

public class TextEditor {
    public static void main(String[] args) {
        // Create the HistoryManager with a max history size of 5
        HistoryManager historyManager = new HistoryManager(5);

        // Simulate adding new text states
        historyManager.addState("Hello");
        historyManager.addState("Hello, World");
        historyManager.addState("Hello, World!");
        historyManager.addState("Hello, World!!");
        historyManager.addState("Hello, World!!!");

        // Display current state
        historyManager.displayCurrentState();

        // Perform undo operations
        historyManager.undo();
        historyManager.undo();

        // Display current state after undo
        historyManager.displayCurrentState();

        // Perform redo operations
        historyManager.redo();
        historyManager.redo();

        // Display current state after redo
        historyManager.displayCurrentState();
    }
}

