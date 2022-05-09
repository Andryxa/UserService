package com.weathe_alligator.user_service.transport.listener;

import com.weathe_alligator.user_service.transport.model.request.LocationRequest;
import com.weathe_alligator.user_service.transport.model.response.LocationResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LocationListener {

    @RabbitListener(queues = "locationQueue", messageConverter = "jsonConverter")
    public LocationResponse locationById(LocationRequest request) {
        log.info("Received location request: {}", request);

        // FIXME: 5/9/22 replace this mock response with service call
        var locationResponse = new LocationResponse();
        locationResponse.setLat(53.22f);
        locationResponse.setLon(26.22f);

        log.info("Sent location response: {}", locationResponse);
        return locationResponse;
    }
}
