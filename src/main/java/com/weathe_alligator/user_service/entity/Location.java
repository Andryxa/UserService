package com.weathe_alligator.user_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "lon")
    @Basic(fetch = FetchType.EAGER)
    private Float lon;

    @Column(name = "lat")
    @Basic(fetch = FetchType.EAGER)
    private Float lat;

    public Location(Float lon, Float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Location() {
    }
}
