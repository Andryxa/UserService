package com.weathe_alligator.user_service.service.impl;

import com.weathe_alligator.user_service.entity.Location;
import com.weathe_alligator.user_service.repo.LocationRepo;
import com.weathe_alligator.user_service.service.LocationService;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepo locationRepo;

    public LocationServiceImpl(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    @Override
    public Location locationById(Long locationId) {
        return locationRepo.getById(locationId);
    }
}
