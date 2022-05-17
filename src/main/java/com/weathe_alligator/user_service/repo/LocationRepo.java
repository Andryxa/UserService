package com.weathe_alligator.user_service.repo;

import com.weathe_alligator.user_service.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Float> {
}
