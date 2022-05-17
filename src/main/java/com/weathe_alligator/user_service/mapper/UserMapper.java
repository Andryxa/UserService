package com.weathe_alligator.user_service.mapper;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.entity.User;


public class UserMapper {
    private UserMapper() {
    }

    public static UserDTO getUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUser_idDTO(user.getUser_id());
        userDTO.setLocation_idDTO(LocationMapper.getLocationDTO(user.getLocation_id()));
        return userDTO;
    }

    public static User getUser(UserDTO userDTO) {
        User user = new User();
        user.setUser_id(userDTO.getUser_idDTO());
        user.setLocation_id(LocationMapper.getLocation(userDTO.getLocation_idDTO()));
        return user;
    }
}
