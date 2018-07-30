package xiti;

public class TicketMaker {
    private static volatile int ticket=1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
