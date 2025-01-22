package nagi.itoshi.place_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import nagi.itoshi.place_service.model.PlaceRepository;
import nagi.itoshi.place_service.model.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceServiceConfig {
    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
    
}
