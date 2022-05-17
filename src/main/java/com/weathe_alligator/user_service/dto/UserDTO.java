package com.weathe_alligator.user_service.dto;

public class UserDTO {
    private int userIdDTO;
    private LocationDTO locationIdDTO;

    public UserDTO(int userIdDTO, LocationDTO locationIdDTO) {
        this.userIdDTO = userIdDTO;
        this.locationIdDTO = locationIdDTO;
    }

    public UserDTO() {
    }

    public int getUserIdDTO() {
        return userIdDTO;
    }

    public void setUserIdDTO(int userIdDTO) {
        this.userIdDTO = userIdDTO;
    }

    public LocationDTO getLocationIdDTO() {
        return locationIdDTO;
    }

    public void setLocationIdDTO(LocationDTO locationIdDTO) {
        this.locationIdDTO = locationIdDTO;
    }
}
