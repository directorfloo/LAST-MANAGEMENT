package trafficSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class Owner {
    @Id
    private String id;
    @DBRef
    private String name;
    private String address;
    private String phone;
    private String gender;
    private String email;



}
