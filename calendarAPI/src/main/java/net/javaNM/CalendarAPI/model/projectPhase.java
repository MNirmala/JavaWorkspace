package net.javaNM.CalendarAPI.model;


import java.util.Date;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "ProjectPhase")
public class projectPhase {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectPhase_Sequence")
	@SequenceGenerator(name = "projectPhase_Sequence", sequenceName = "PROJECTPHASE_SEQ")
	public Long id;
	
	  @JoinColumn(name = "Project_Id", referencedColumnName = "Id", nullable = false)
	  
	  @ManyToOne(fetch = FetchType.LAZY, optional = false) 
	  public project Project;
	 public project getProject() {return Project;}
	@Column(name = "Status")
	public String status;
	@Column(name = "StartDate")
	public Date startDate;
	@Column(name = "EndDate")
	public Date endDate;
	//@OneToMany(mappedBy ="ProjectPhase", cascade = CascadeType.ALL,fetch = FetchType.LAZY)	
	//private Set<calendarScheduler> schedules;
	
	//public Set<calendarScheduler> getSchedule() { return schedules; }
	
	public projectPhase(project Project, String status, Date startDate, Date endDate) {
		this.Project=Project;
		this.status=status;
		this.startDate=startDate;
		this.endDate=endDate;
		
	}
}
