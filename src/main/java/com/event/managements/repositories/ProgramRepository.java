package com.event.managements.repositories;

import com.event.managements.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    List<Program> findByEventId(Long eventId);
}
