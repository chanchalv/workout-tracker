package com.chanchal.workout_tracker.controller;

import com.chanchal.workout_tracker.entity.Workout;
import com.chanchal.workout_tracker.service.WorkoutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin

public class WorkoutController {


    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @PostMapping
    public Workout addWorkout(@RequestBody Workout workout) {
        return service.saveWorkout(workout);
    }

    @GetMapping
    public List<Workout> getWorkouts() {
        return service.getAllWorkouts();
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable Long id) {
        service.deleteWorkout(id);
    }
}