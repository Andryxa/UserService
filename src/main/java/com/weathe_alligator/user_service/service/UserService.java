package com.weathe_alligator.user_service.service;

import com.weathe_alligator.user_service.dto.UserDTO;

public interface UserService {

    UserDTO findById(Long userId);
}
