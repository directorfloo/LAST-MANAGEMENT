package trafficSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Ticket {
    @Id
    private String id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean hasPaid = false;
    private Officer issuer;
    private LocalDateTime dateOfBooking ;
    private LocalDateTime dateOfPayment;


}
