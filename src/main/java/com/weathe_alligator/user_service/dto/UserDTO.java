package com.weathe_alligator.user_service.dto;

public class UserDTO {
    private Long userId;
    private LocationDTO location;

    public UserDTO(Long userId, LocationDTO location) {
        this.userId = userId;
        this.location = location;
    }

    public UserDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }
}
