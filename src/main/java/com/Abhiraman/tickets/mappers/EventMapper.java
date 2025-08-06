package com.Abhiraman.tickets.mappers;

import com.Abhiraman.tickets.domain.CreateEventRequest;
import com.Abhiraman.tickets.domain.CreateTicketTypeRequest;
import com.Abhiraman.tickets.domain.dtos.*;
import com.Abhiraman.tickets.domain.entities.Event;
import com.Abhiraman.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);


}
