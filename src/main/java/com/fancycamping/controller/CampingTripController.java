package com.fancycamping.controller;

import com.fancycamping.model.CampingTrip;
import com.fancycamping.model.State;
import com.fancycamping.service.CampingTripService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampingTripController {
    private CampingTripService campingTripService;

    public CampingTripController(CampingTripService campingTripService) {
        this.campingTripService = campingTripService;
    }

    @RequestMapping(value = "/api/trip/{id:.+}", produces = MediaType.APPLICATION_JSON_VALUE)
    private CampingTrip findOne(@PathVariable Long id) {
        return campingTripService.findOne(id);
    }

    @RequestMapping("/api/trips/{state:.+}")
    private List<CampingTrip> getAllSummariesForState(@PathVariable State state) {
        return campingTripService.findByState(state);
    }

}