package com.weathe_alligator.user_service.dto;

public class LocationDTO {
    private int locationIdDTO;
    private Float lonDTO;
    private Float latDTO;

    public LocationDTO(int locationIdDTO, Float lonDTO, Float latDTO) {
        this.locationIdDTO = locationIdDTO;
        this.lonDTO = lonDTO;
        this.latDTO = latDTO;
    }

    public LocationDTO() {
    }

    public int getLocationIdDTO() {
        return locationIdDTO;
    }

    public void setLocationIdDTO(int locationIdDTO) {
        this.locationIdDTO = locationIdDTO;
    }

    public Float getLonDTO() {
        return lonDTO;
    }

    public void setLonDTO(Float lonDTO) {
        this.lonDTO = lonDTO;
    }

    public Float getLatDTO() {
        return latDTO;
    }

    public void setLatDTO(Float latDTO) {
        this.latDTO = latDTO;
    }
}
