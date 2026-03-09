package com.chanchal.workout_tracker.repository;

import com.chanchal.workout_tracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}

