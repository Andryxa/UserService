package com.weathe_alligator.user_service.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location locationId;

    public User(Long userId, Location locationId) {
        this.userId = userId;
        this.locationId = locationId;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }
}