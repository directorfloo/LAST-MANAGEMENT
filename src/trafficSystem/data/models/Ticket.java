package trafficSystem.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "tickets")
@Data
public class Ticket {

    private String id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean hasPaid = false;
    private Officer issuer;
    private LocalDateTime dateOfBooking = LocalDateTime.now();
    private LocalDateTime dateOfPayment;


}