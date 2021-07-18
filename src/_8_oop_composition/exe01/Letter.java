package _8_oop_composition.exe01;

public class Letter {
    private Address from;
    private Address to;
    private Date sent;
    private Date received;

    public Letter(Address from, Address to, Date sent, Date received) {
        this.from = from;
        this.to = to;
        this.sent = sent;
        this.received = received;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "from=" + from +
                ", to=" + to +
                ", sent=" + sent +
                ", received=" + received +
                '}';
    }
}
