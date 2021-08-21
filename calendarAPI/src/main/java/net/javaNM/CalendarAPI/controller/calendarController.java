package net.javaNM.CalendarAPI.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.javaNM.CalendarAPI.model.calendarScheduler;
import net.javaNM.CalendarAPI.repository.CalendarAPIRepository;

import net.javaNM.CalendarAPI.service.CalendarAPIService;

@RestController
@RequestMapping("/api")
public class calendarController {
	  @Autowired
	    private CalendarAPIRepository courseRepository;
	  	
	  @Autowired
	  private CalendarAPIService courseService;
	    @GetMapping("/calendars")
	    public List < calendarScheduler > getCalendar() {
	        return courseService.listScheduleByPhaseAndUsers();
	    }
}
