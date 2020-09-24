package reservationservice.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reservationservice.demo.model.Reservation;

/**
 * @author mkarki
 */
public interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {
}
