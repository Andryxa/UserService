package com.weathe_alligator.user_service.service;

import com.weathe_alligator.user_service.dto.LocationDTO;

public interface LocationService {

    LocationDTO findById(Long locationId);
}
