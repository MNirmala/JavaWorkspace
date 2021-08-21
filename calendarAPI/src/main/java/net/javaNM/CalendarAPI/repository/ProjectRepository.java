package net.javaNM.CalendarAPI.repository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaNM.CalendarAPI.model.*;

public interface ProjectRepository extends JpaRepository<project, Long>{

}
