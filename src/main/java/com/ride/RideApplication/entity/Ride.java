package com.ride.RideApplication.entity;

import com.ride.RideApplication.enums.RideStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rides")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rider_user_id")
    private User rider;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;

    @Column(nullable = false)
    private double pickupLatitude;
    @Column(nullable = false)
    private double pickupLongitude;
    @Column(nullable = false)

    private double dropLatitude;
    @Column(nullable = false)
    private double dropLongitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RideStatus status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime acceptedAt;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;



}
