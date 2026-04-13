package com.lavish.eventmanagementsystem.Controllers;

import com.lavish.eventmanagementsystem.DTO.EventResponseDTO;
import com.lavish.eventmanagementsystem.Models.Event;
import com.lavish.eventmanagementsystem.Services.EventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@Tag(name = "Event APIs", description = "Operations related to events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/add")
    @Operation(summary = "Create a new event")
    public ResponseEntity<Event> create(@RequestBody Event event) {
        Event createdEvent = eventService.createEvent(event);
        return ResponseEntity.status(201).body(createdEvent); // CREATED
    }

    @GetMapping("/all")
    @Operation(summary = "Get all Events")
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get event by ID")
    public ResponseEntity<Event> getById(@PathVariable Long id) {
        Event event = eventService.getEventById(id);
        return ResponseEntity.ok(event);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete event by ID")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        eventService.deleteEventById(id);
        return ResponseEntity.ok("Event deleted successfully");
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update event by ID")
    public ResponseEntity<Event> update(@PathVariable Long id, @RequestBody Event newEvent) {
        Event updatedEvent = eventService.updateEvent(id, newEvent);
        return ResponseEntity.ok(updatedEvent);
    }
}
