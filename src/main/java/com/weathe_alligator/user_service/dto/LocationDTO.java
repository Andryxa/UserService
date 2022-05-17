package com.weathe_alligator.user_service.dto;

public class LocationDTO {
    private int location_idDTO;
    private Float lonDTO;
    private Float latDTO;

    public LocationDTO(int location_idDTO, Float lonDTO, Float latDTO) {
        this.location_idDTO = location_idDTO;
        this.lonDTO = lonDTO;
        this.latDTO = latDTO;
    }

    public LocationDTO() {
    }

    public int getLocation_idDTO() {
        return location_idDTO;
    }

    public void setLocation_idDTO(int location_idDTO) {
        this.location_idDTO = location_idDTO;
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
