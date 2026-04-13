package com.lavish.eventmanagementsystem.Models;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Event entity representing event details")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique ID of event", example = "1")
    private Long id;

    @Column(nullable = false)
    @Schema(description = "Event name", example = "Tech Fest")
    private String name;

    @Column(nullable = false)
    @Schema(description = "Event Date", example = "2026-04-15")
    private LocalDate eventDate;

    @Schema(description = "Event Starting Time", example = "16:00:00")
    private LocalTime startTime;

    @Schema(description = "Event price", example = "Rs 299.0")
    private Double price;

    @Column(nullable = false)
    @Schema(description = "Event location", example = "Delhi")
    private String location;

    @Schema(description = "Event description", example = "Live Concert")
    private String description;

    @Schema(description = "Event capacity", example = "4500")
    private Integer capacity;
}