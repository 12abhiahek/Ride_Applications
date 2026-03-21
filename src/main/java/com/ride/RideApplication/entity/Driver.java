package com.ride.RideApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", unique = true)
    private User userId;

    @Column(nullable = false)
    private boolean available;

    @Column
    private double latitude;

    @Column
    private double longitude;

    private String vehicleType; // BIKE, CAR etc.
}
