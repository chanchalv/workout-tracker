package com.chanchal.workout_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workoutName;

    private int durationMinutes;

    private int caloriesBurned;

    private LocalDate workoutDate;

    private String notes;
}