package com.lavish.eventmanagementsystem.Services;

import com.lavish.eventmanagementsystem.Models.Event;
import com.lavish.eventmanagementsystem.Repo.Eventrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private Eventrepo eventrepo;

    public Event createEvent(Event event) {
        Event newEvent = new Event();
        newEvent.setName(event.getName());
        newEvent.setDescription(event.getDescription());
        newEvent.setLocation(event.getLocation());
        newEvent.setPrice(event.getPrice());
        newEvent.setEventDate(event.getEventDate());
        newEvent.setStartTime(event.getStartTime());
        newEvent.setCapacity(event.getCapacity());
        return eventrepo.save(newEvent);

    }

    public List<Event> getAllEvents() {
        return eventrepo.findAll();
    }

    public Event getEventById(Long id) {
        return eventrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
    }

    public void deleteEventById(Long id) {
        Event event = eventrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        eventrepo.delete(event);
    }

    public Event updateEvent(Long id, Event event) {
        Event newEvent = eventrepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Event not found"));
        newEvent.setName(event.getName());
        newEvent.setDescription(event.getDescription());
        newEvent.setLocation(event.getLocation());
        newEvent.setPrice(event.getPrice());
        newEvent.setEventDate(event.getEventDate());
        newEvent.setStartTime(event.getStartTime());
        newEvent.setCapacity(event.getCapacity());
        return eventrepo.save(newEvent);

    }
}
