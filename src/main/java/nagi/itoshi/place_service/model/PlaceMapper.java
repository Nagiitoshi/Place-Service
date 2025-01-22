package nagi.itoshi.place_service.model;

import nagi.itoshi.place_service.api.PlaceRequest;
import nagi.itoshi.place_service.api.PlaceResponse;

public class PlaceMapper {
    public static Place updatePlaceFromDTO(PlaceRequest placeRequest, Place place) {
        final String name = org.springframework.util.StringUtils.hasText(placeRequest.name()) ? placeRequest.name() : place.name();

        final String city = org.springframework.util.StringUtils.hasText(placeRequest.city()) ? placeRequest.city() : place.city();

        final String state = org.springframework.util.StringUtils.hasText(placeRequest.state()) ? placeRequest.state() : place.state();

        return new Place(place.id(), name, place.slug(), city, state, place.createdAt(), place.updateAt());
    }

    public static PlaceResponse tResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),
        place.city(), place.state(), place.createdAt(), place.updateAt());
    }

}
