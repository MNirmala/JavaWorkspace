package net.javaNM.CalendarAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaNM.CalendarAPI.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
 List<Course> findByInstructorId(Long instructorId);
 Optional<Course> findByIdAndInstructorId(Long id, Long instructorId);
}
