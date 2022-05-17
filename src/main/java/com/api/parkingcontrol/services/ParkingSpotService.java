package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotService(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }
}
