package net.javaNM.CalendarAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//https://www.javaguides.net/2019/08/spring-boot-jpa-hibernate-one-to-many-example-tutorial.html
//https://allaroundjava.com/many-to-one-jpa-hibernate/
//http://localhost:8080/api/calendarSchedules
@SpringBootApplication
@EnableJpaAuditing //  Enabling JPA Auditing
public class CalendarApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApiApplication.class, args);
	}

}
