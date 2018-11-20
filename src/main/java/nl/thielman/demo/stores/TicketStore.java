package nl.thielman.demo.stores;

public class TicketStore {

    private String name;
    private int amountSold;

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public String getName() {
        return name;
    }

    public int getAmountSold() {
        return amountSold;
    }
}
