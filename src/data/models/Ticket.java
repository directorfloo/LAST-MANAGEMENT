package data.models;

import java.time.LocalDateTime;


public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean haspaid;
    private Officer issuer;
    private LocalDateTime dateOfBooking ;
    private LocalDateTime dateOfPayment;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Offence getOffence() {
        return offence;
    }
    public void setOffence(Offence offence) {
        this.offence = offence;

    }
    public boolean isHaspaid() {
        return haspaid;
    }

    public void setHaspaid(boolean haspaid) {
        this.haspaid = haspaid;
    }

    public Officer getIssuer() {
        return issuer;

    }
    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }
    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }
    public void setDateOfBooking() {
        this.dateOfBooking = LocalDateTime.now();
    }


    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", offence=" + offence +
                ", haspaid=" + haspaid +
                ", issuer=" + issuer +
                ", dateOfBooking=" + dateOfBooking +
                ", dateOfPayment=" + dateOfPayment +
                '}';
    }
}
