package trafficSystem.data.models;

public enum Offence {

    ONE_WAY("One Way", 35000),
    DRUNK_DRIVING("Drunk Driving", 30000),
    NO_SEAT_BELT("No Seat Belt", 15000),
    OVER_SPEEDING("Over Speeding", 350000);

    private final String name;
    private final int amount;

    Offence(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}

