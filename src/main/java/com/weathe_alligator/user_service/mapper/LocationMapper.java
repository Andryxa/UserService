package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.LocationDTO;
import com.weathe_alligator.user_service.entity.Location;

public class LocationMapper {
    private LocationMapper() {
    }

    public static LocationDTO getLocationDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setLocationIdDTO(location.getLocationId());
        locationDTO.setLatDTO(location.getLat());
        locationDTO.setLonDTO(location.getLon());
        return locationDTO;
    }

    public static Location getLocation(LocationDTO locationDTO) {
        Location location = new Location();
        location.setLocationId(locationDTO.getLocationIdDTO());
        location.setLat(locationDTO.getLatDTO());
        location.setLon(locationDTO.getLonDTO());
        return location;
    }
}
