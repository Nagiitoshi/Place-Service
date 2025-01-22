package nagi.itoshi.place_service.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.validation.constraints.NotBlank;

public record Place(@Id Long id, @NotBlank String name, String slug,
        @NotBlank String city,
        @NotBlank String state,
        @CreatedDate LocalDateTime createdAt,
        @LastModifiedDate LocalDateTime updateAt) {
    public Place whithSlug(String slug){
        return new Place(id, slug, slug, slug, slug, createdAt, updateAt);


    }

}
