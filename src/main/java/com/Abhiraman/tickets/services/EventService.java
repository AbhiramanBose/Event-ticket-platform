package com.Abhiraman.tickets.services;

import com.Abhiraman.tickets.domain.CreateEventRequest;
import com.Abhiraman.tickets.domain.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface EventService {

    Event createEvent(UUID organizerID,CreateEventRequest event);
    Page<Event> listEventsForOrganizer(UUID organizerId, Pageable pageable);
}
