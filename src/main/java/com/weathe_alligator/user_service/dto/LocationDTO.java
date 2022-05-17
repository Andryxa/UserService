package com.weathe_alligator.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LocationDTO {
    private Long locationId;
    private Float lon;
    private Float lat;

    public LocationDTO() {
    }

}
