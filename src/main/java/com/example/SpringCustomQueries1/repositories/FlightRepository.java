package com.example.SpringCustomQueries1.repositories;

import com.example.SpringCustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}