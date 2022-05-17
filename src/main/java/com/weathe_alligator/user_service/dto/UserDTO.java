package com.weathe_alligator.user_service.dto;

public class UserDTO {
    private Long userId;
    private LocationDTO locationId;

    public UserDTO(Long userId, LocationDTO locationId) {
        this.userId = userId;
        this.locationId = locationId;
    }

    public UserDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocationDTO getLocationId() {
        return locationId;
    }

    public void setLocationId(LocationDTO locationId) {
        this.locationId = locationId;
    }
}
