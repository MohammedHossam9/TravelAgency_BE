package com.travelagency.hotel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.travelagency.event.models.Event;
import com.travelagency.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import com.travelagency.common.models.Invoice;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @JsonIgnoreProperties({"bookings", "password", "resetPasswordToken", "resetPasswordTokenExpiry"})
    private User user;
    private Room room;
    private Invoice invoice;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Event> recommendedEvents;
}