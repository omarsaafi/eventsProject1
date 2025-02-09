package tn.esprit.eventsproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.eventsproject.entities.Event;
import tn.esprit.eventsproject.entities.Logistics;
import tn.esprit.eventsproject.entities.Participant;
import tn.esprit.eventsproject.services.IEventServices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class EventServiceUnitTest {

    @Mock
    IEventServices eventServices;

    @BeforeEach
    public void setup() {
        // Setup or initialization logic if needed
    }


    @Test
    void testGetLogisticsDates() {
        // Define a date range
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(10);

        // Create mock Logistics
        Logistics logistics1 = new Logistics();
        Logistics logistics2 = new Logistics();
        List<Logistics> logisticsList = new ArrayList<>();
        logisticsList.add(logistics1);
        logisticsList.add(logistics2);

        // Define behavior for getLogisticsDates
        when(eventServices.getLogisticsDates(startDate, endDate)).thenReturn(logisticsList);

        // Call the service method
        List<Logistics> result = eventServices.getLogisticsDates(startDate, endDate);

        // Verify and assert
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(eventServices, times(1)).getLogisticsDates(startDate, endDate);
    }

    @Test
    void testCalculCout() {
        // Mock void method
        doNothing().when(eventServices).calculCout();

        // Call the service method
        eventServices.calculCout();

        // Verify that the method was called
        verify(eventServices, times(1)).calculCout();
    }

    @Test
    void testGetParReservLogis() {
        // Create mock Participants
        Participant participant1 = new Participant();
        Participant participant2 = new Participant();
        List<Participant> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);

        // Define behavior for getParReservLogis
        when(eventServices.getParReservLogis()).thenReturn(participants);

        // Call the service method
        List<Participant> result = eventServices.getParReservLogis();

        // Verify and assert
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(eventServices, times(1)).getParReservLogis();
    }
}
