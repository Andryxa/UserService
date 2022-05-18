package com.weathe_alligator.user_service.service.impl;

import com.weathe_alligator.user_service.dto.LocationDTO;
import com.weathe_alligator.user_service.mapper.LocationMapper;
import com.weathe_alligator.user_service.repo.LocationRepo;
import com.weathe_alligator.user_service.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepo locationRepo;

    @Override
    public LocationDTO findById(Long locationId) {
        return locationRepo.findById(locationId).map(LocationMapper::toDTO).orElse(null);
    }
}
