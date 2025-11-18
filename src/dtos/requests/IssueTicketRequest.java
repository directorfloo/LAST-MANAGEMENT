package dtos.requests;

import data.models.Offence;

import java.time.LocalDateTime;


public class IssueTicketRequest {

    private int VehicleId ;
    private String offence;
    private String officerEmail;
    private String officerName;
    private String VehicleChaiseNumber;
    private LocalDateTime dateOfBooking = LocalDateTime.now();
    private LocalDateTime dateOfPayment = LocalDateTime.now();

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = LocalDateTime.now();
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = LocalDateTime.now();
    }



    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }



    public String getOfficerEmail() {
        return officerEmail;
    }

    public String getOffence() {
        return offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }

    public String getVehicleChaiseNumber() {
        return VehicleChaiseNumber;
    }

    public void setVehicleChaiseNumber(String vehicleChaiseNumber) {
        VehicleChaiseNumber = vehicleChaiseNumber;
    }










}
