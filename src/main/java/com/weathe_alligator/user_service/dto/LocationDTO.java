package com.weathe_alligator.user_service.dto;

public class LocationDTO {
    private Long locationId;
    private Float lon;
    private Float lat;

    public LocationDTO(Long locationId, Float lon, Float lat) {
        this.locationId = locationId;
        this.lon = lon;
        this.lat = lat;
    }

    public LocationDTO() {
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }
}
