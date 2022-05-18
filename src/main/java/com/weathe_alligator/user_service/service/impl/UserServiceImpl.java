package com.weathe_alligator.user_service.service.impl;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.mapper.UserMapper;
import com.weathe_alligator.user_service.repo.UserRepo;
import com.weathe_alligator.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public UserDTO findById(Long userId) {
        return userRepo.findById(userId).map(UserMapper::toDTO).orElse(null);
    }
}
