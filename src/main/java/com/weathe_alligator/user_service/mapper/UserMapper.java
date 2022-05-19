package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.entity.User;


public class UserMapper {
    private UserMapper() {
    }

    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setLocationId(LocationMapper.toDTO(user.getLocationId()));
        return userDTO;
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setLocationId(LocationMapper.toEntity(userDTO.getLocationId()));
        return user;
    }
}
