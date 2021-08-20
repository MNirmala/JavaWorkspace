package net.javaNM.CalendarAPI.model;
import javax.persistence.*;

@Entity
@Table(name = "Users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_Sequence")
	@SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ")
	public Long id;
	@Column(name = "User_Name")
	public String userName;
	@Column(name = "Email")
	public String email;
	
	//@OneToMany(mappedBy ="Users", cascade = CascadeType.ALL,fetch = FetchType.LAZY)	
	//private Set<calendarScheduler> schedules;
	
	//public Set<calendarScheduler> getSchedule() { return schedules; }

}