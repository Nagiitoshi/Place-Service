package nagi.itoshi.place_service.model;

import com.github.slugify.Slugify;

import nagi.itoshi.place_service.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null,placeRequest.name(), null, null, null, null, null)
    }
    
}
