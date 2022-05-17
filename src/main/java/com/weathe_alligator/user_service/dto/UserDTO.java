package com.weathe_alligator.user_service.dto;

public class UserDTO {
    private int user_idDTO;
    private LocationDTO location_idDTO;

    public UserDTO(int user_idDTO, LocationDTO location_idDTO) {
        this.user_idDTO = user_idDTO;
        this.location_idDTO = location_idDTO;
    }

    public UserDTO() {
    }

    public int getUser_idDTO() {
        return user_idDTO;
    }

    public void setUser_idDTO(int user_idDTO) {
        this.user_idDTO = user_idDTO;
    }

    public LocationDTO getLocation_idDTO() {
        return location_idDTO;
    }

    public void setLocation_idDTO(LocationDTO location_idDTO) {
        this.location_idDTO = location_idDTO;
    }
}
