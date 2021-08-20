package net.javaNM.CalendarAPI.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaNM.CalendarAPI.model.calendarScheduler;
import net.javaNM.CalendarAPI.service.CalendarAPIService;

@RestController
@RequestMapping("/api")
public class calendarController {
	@Autowired
	CalendarAPIService calendarService;
	
	@GetMapping("/calendarSchedules")
	public ResponseEntity<List<calendarScheduler>> getAllSchedules() {
		try {
			List<calendarScheduler> list = calendarService.listAllProjectsAndUsers();
			
			if (list.isEmpty() || list.size() == 0) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
