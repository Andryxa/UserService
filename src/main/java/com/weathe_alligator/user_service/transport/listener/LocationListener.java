package com.weathe_alligator.user_service.transport.listener;

import com.weathe_alligator.user_service.dto.UserDTO;
import com.weathe_alligator.user_service.service.UserService;
import com.weathe_alligator.user_service.transport.model.request.LocationRequest;
import com.weathe_alligator.user_service.transport.model.response.LocationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class LocationListener {
    private final UserService userService;

    @RabbitListener(queues = "locationQueue", messageConverter = "jsonConverter")
    public LocationResponse locationById(LocationRequest request) {
        log.info("Received location request: {}", request);
        UserDTO user = userService.findById(request.getUserId());
        var locationResponse = new LocationResponse();
        locationResponse.setLat(user.getLocation().getLat());
        locationResponse.setLon(user.getLocation().getLon());

        log.info("Sent location response: {}", locationResponse);
        return locationResponse;
    }
}
