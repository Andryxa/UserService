package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.LocationDTO;
import com.weathe_alligator.user_service.entity.Location;

public class LocationMapper {
    private LocationMapper() {
    }

    public static LocationDTO toDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setLocationId(location.getLocationId());
        locationDTO.setLat(location.getLat());
        locationDTO.setLon(location.getLon());
        return locationDTO;
    }

    public static Location toEntity(LocationDTO locationDTO) {
        Location location = new Location();
        location.setLocationId(locationDTO.getLocationId());
        location.setLat(locationDTO.getLat());
        location.setLon(locationDTO.getLon());
        return location;
    }
}
