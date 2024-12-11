package com.example.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.example.back.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    
}