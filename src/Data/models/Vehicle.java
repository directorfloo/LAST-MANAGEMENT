package Data.models;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String name;
    private String model;
    private String colour;
    private  String PlateNumber;
    private  Owner  owner;
    private int id;
    private String Year;
    private List<Ticket> tickets;

    public Vehicle(String name, String model, String colour, int id,Owner owner,String PlateNumber, String Year ) {

        this.name = name;
        this.model = model;
        this.colour = colour;
        this.id = id;
        this.owner = owner;
        this.tickets = new ArrayList<>();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public String getPlateNumber() {
        return PlateNumber;

    }
    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }
    public String getYear() {
        return Year;
    }
    public void setYear(String Year) {
        this.Year = Year;
    }
}
