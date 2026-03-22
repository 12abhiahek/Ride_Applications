package com.ride.RideApplication.repository;

import com.ride.RideApplication.entity.Ride;
import com.ride.RideApplication.enums.RideStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RideRepsoitory extends JpaRepository<Ride, Long> {
    List<Ride> findByDriverId(Long driverId);
    List<Ride> findByRiderId(Long riderUserId);
    List<Ride> findByStatus(RideStatus status);
}
