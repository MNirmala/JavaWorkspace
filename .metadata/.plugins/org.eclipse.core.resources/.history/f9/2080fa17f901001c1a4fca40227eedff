package net.javaNM.CalendarAPI.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import net.javaNM.CalendarAPI.model.calendarScheduler;
import net.javaNM.CalendarAPI.repository.CalendarAPIRepository;

@Service
public class CalendarAPIImpl implements CalendarAPIService {
	@Autowired
	private CalendarAPIRepository calendarAPIRepository;

	@Override
	public List<calendarScheduler> listAllProjectsAndUsers() {
		// TODO Auto-generated method stub
		return calendarAPIRepository.findAll();
	}

}
