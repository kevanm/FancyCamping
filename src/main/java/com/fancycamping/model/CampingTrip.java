package com.fancycamping.model;

import com.sun.javafx.beans.IDProperty;
import lombok.Builder;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Builder
public class CampingTrip implements Serializable {

    private Long id;

    private State state;

    private List<Date> tripDates;

    private Int location;
}
