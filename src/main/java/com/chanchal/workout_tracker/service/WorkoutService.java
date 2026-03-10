package com.chanchal.workout_tracker.service;

import com.chanchal.workout_tracker.entity.Workout;
import com.chanchal.workout_tracker.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository repository;

    public WorkoutService(WorkoutRepository repository) {
        this.repository = repository;
    }

    public Workout saveWorkout(Workout workout) {
        return repository.save(workout);
    }

    public List<Workout> getAllWorkouts() {
        return repository.findAll();
    }

    public void deleteWorkout(Long id) {
        repository.deleteById(id);
    }

    public Workout updateWorkout(Long id, Workout updatedWorkout) {
        Workout existingWorkout = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workout not found"));

        existingWorkout.setWorkoutName(updatedWorkout.getWorkoutName());
        existingWorkout.setDurationMinutes(updatedWorkout.getDurationMinutes());
        existingWorkout.setCaloriesBurned(updatedWorkout.getCaloriesBurned());
        existingWorkout.setWorkoutDate(updatedWorkout.getWorkoutDate());
        existingWorkout.setNotes(updatedWorkout.getNotes());

        return repository.save(existingWorkout);
    }
}