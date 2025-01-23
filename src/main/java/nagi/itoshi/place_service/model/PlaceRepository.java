package nagi.itoshi.place_service.model;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long>, ReactiveQueryByExampleExecutor<Place>{



}
