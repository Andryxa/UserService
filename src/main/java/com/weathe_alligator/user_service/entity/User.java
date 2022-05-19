package com.weathe_alligator.user_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "location_id")
    private Location locationId;

    public User(Long userId, Location locationId) {
        this.userId = userId;
        this.locationId = locationId;
    }

    public User() {
    }
}