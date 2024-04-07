package com.example.SpringCustomQueries1.servicies;

import com.example.SpringCustomQueries1.entities.Flight;
import com.example.SpringCustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> provisionFlights(){
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setId((long) i);
            flight.setDescription("Desc: " + i);
            flight.setFromAirport("From Airport: " + i);
            flight.setToAirport("To Airport: " + i);
            flightRepository.save(flight);
        }
        return flightRepository.findAll();
    }

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }


}