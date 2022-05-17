package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.entity.User;


public class UserMapper {
    private UserMapper() {
    }

    public static UserDTO getUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setLocation(LocationMapper.getLocationDTO(user.getLocation()));
        return userDTO;
    }

    public static User getUser(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setLocation(LocationMapper.getLocation(userDTO.getLocation()));
        return user;
    }
}
