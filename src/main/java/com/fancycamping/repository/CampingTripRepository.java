package com.fancycamping.repository;


import com.fancycamping.model.CampingTrip;
import com.fancycamping.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampingTripRepository extends JpaRepository<CampingTrip, Long> {

    CampingTrip findOne(Long id);

    List<CampingTrip> findByState(State state);
}
