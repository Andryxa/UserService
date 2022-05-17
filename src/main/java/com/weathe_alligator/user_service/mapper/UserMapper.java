package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.entity.User;


public class UserMapper {
    private UserMapper() {
    }

    public static UserDTO getUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserIdDTO(user.getUserId());
        userDTO.setLocationIdDTO(LocationMapper.getLocationDTO(user.getLocationId()));
        return userDTO;
    }

    public static User getUser(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserIdDTO());
        user.setLocationId(LocationMapper.getLocation(userDTO.getLocationIdDTO()));
        return user;
    }
}
