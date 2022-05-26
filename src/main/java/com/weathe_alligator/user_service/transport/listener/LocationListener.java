package com.weathe_alligator.user_service.transport.listener;

import com.weathe_alligator.user_service.dto.LocationDTO;
import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.service.LocationService;
import com.weathe_alligator.user_service.service.UserService;
import com.weathe_alligator.user_service.transport.model.request.LocationRequest;
import com.weathe_alligator.user_service.transport.model.response.LocationResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Component
@AllArgsConstructor
@Transactional
public class LocationListener {
    private final UserService userService;
    private final LocationService locationService;

    @RabbitListener(queues = "locationQueue", messageConverter = "jsonConverter")
    public LocationResponse locationById(LocationRequest request) {
        log.info("Received location request: {}", request);
        UserDTO user = userService.findById(request.getUserId());
        Long locationId = user.getLocationId().getLocationId();
        LocationDTO location = locationService.findById(locationId);
        var locationResponse = new LocationResponse();
        locationResponse.setLat(location.getLat());
        locationResponse.setLon(location.getLon());

        log.info("Sent location response: {}", locationResponse);
        return locationResponse;
    }
}
