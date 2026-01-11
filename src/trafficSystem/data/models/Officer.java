package trafficSystem.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Officer {
    @Id
    private String id;
    @DBRef
    private String name;
    private String rank;
    private String email;





}
