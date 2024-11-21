package com.bits.oems.commons.model;

import lombok.Data;

import java.util.Set;

@Data
public class EventDTO {

    private String eventId;

    private String name;

    private String description;

    private String startDate;

    private Long durationInSeconds;

    private String location;

    private String paymentId;

    private Set<String> participants;

}
