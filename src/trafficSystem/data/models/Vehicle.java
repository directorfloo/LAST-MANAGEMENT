package trafficSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document
@Data
public class Vehicle {
    @Id
    private String id;
    @DBRef
    private String name;
    private String model;
    private String colour;
    private  String PlateNumber;
    private  Owner  owner;
    private String Year;
    private String  chaiseNumber;
    private List<Ticket> tickets = new ArrayList<>();

}
