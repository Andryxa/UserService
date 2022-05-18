package com.weathe_alligator.user_service.service.impl;

import com.weathe_alligator.user_service.entity.User;
import com.weathe_alligator.user_service.repo.UserRepo;
import com.weathe_alligator.user_service.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    private final UserRepo userRepo;


    public userServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User userById(Long userId) {
        return userRepo.getById(userId);
    }
}
