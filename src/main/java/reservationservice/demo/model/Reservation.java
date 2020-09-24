package reservationservice.demo.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author mkarki
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Reservation {
    private String id;
    private String name;
}
