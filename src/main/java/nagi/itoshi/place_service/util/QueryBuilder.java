package nagi.itoshi.place_service.util;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import nagi.itoshi.place_service.model.Place;

public class QueryBuilder {
    private QueryBuilder(){

    }

    public static Example<Place> makeQuery(Place planet){
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnoreNullValues();
        
        return Example.of(planet, exampleMatcher);
    }
    
}
