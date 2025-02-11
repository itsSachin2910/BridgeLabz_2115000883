import java.util.Date;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    Date bookingTime;
    TicketNode next;

    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, Date bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;
    private int ticketCount;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.ticketCount = 0;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, Date bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        
        if (ticketCount == 0) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        ticketCount++;
    }

    public boolean removeTicket(int ticketId) {
        if (ticketCount == 0) {
            return false;
        }

        TicketNode current = head;
        TicketNode previous = null;

        do {
            if (current.ticketId == ticketId) {
                if (previous == null) {
                    if (current.next == head) {
                        head = tail = null;
                    } else {
                        head = current.next;
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                ticketCount--;
                return true;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        return false;
    }

    public void displayTickets() {
        if (ticketCount == 0) {
            return;
        }

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId);
            System.out.println("Customer: " + current.customerName);
            System.out.println("Movie: " + current.movieName);
            System.out.println("Seat: " + current.seatNumber);
            System.out.println("Booking Time: " + current.bookingTime);
            System.out.println("-------------------------------------");
            current = current.next;
        } while (current != head);
    }

    public void searchTicket(String searchTerm) {
        if (ticketCount == 0) {
            return;
        }

        TicketNode current = head;
        boolean found = false;
        do {
            if (current.customerName.contains(searchTerm) || current.movieName.contains(searchTerm)) {
                System.out.println("Ticket found:");
                System.out.println("Ticket ID: " + current.ticketId);
                System.out.println("Customer: " + current.customerName);
                System.out.println("Movie: " + current.movieName);
                System.out.println("Seat: " + current.seatNumber);
                System.out.println("Booking Time: " + current.bookingTime);
                System.out.println("-------------------------------------");
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found matching the search term.");
        }
    }

    public int getTotalBookedTickets() {
        return ticketCount;
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem();

        reservationSystem.addTicket(1, "Alice", "Inception", "A1", new Date());
        reservationSystem.addTicket(2, "Bob", "Titanic", "B1", new Date());
        reservationSystem.addTicket(3, "Charlie", "Avatar", "C1", new Date());

        reservationSystem.displayTickets();

        reservationSystem.searchTicket("Alice");
        reservationSystem.searchTicket("Titanic");

        reservationSystem.removeTicket(2);

        reservationSystem.displayTickets();

        System.out.println("Total booked tickets: " + reservationSystem.getTotalBookedTickets());
    }
}

