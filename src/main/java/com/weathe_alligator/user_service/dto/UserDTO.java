package com.weathe_alligator.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private Long userId;
    private LocationDTO location;

    public UserDTO() {
    }

}
