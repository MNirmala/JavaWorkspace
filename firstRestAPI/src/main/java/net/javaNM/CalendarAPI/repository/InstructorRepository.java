package net.javaNM.CalendarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaNM.CalendarAPI.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}
