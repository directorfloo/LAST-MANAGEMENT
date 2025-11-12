package dtos.requests;

public class RegisterVehicleRequest {
    private String VehicleName;
    private String  VehicleModel;
    private String VehicleColour;
    private String VehicleYear;
    private String OwnerName;
    private String OwnerAddress;
    private String OwnerPhoneNumber;
    private String OwnerEmail;

    public String getOwnerPhoneNumber() {
        return OwnerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        OwnerPhoneNumber = ownerPhoneNumber;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String getVehicleColour() {
        return VehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        VehicleColour = vehicleColour;
    }



    public String getVehicleYear() {
        return VehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        VehicleYear = vehicleYear;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getOwnerAddress() {
        return OwnerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        OwnerAddress = ownerAddress;
    }




    public String getOwnerEmail() {
        return OwnerEmail;
    }

    public void setOwnerEmail(String email) {
        OwnerEmail = email;
    }

}
