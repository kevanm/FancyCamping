package com.fancycamping.model;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Builder
public class CampingTrip implements Serializable {

    @Id
    @Generated
    private Long id;

    private State state;

    private int location;

    private List<Date> tripDates;

}
