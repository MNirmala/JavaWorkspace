package net.javaNM.CalendarAPI.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "CalendarScheduler")
public class calendarScheduler {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "calendarScheduler_Sequence")
	@SequenceGenerator(name = "calendarScheduler_Sequence", sequenceName = "CALENDARSCHEDULER_SEQ")
	public Long id;
	
	  @JoinColumn(name = "ProjectPhase_Id", referencedColumnName = "Id", nullable =
	  false)	  
	  @ManyToOne(fetch = FetchType.LAZY, optional = false) 
	  public projectPhase ProjectPhase;
	  
	  @JoinColumn(name = "User_Id", referencedColumnName = "Id", nullable = false)	  
	  @ManyToOne(fetch = FetchType.LAZY, optional = false) 
	  public user User;
	 
	public user getUser() {return User;}
	public projectPhase getProjectPhase() {return ProjectPhase;}
	@Column(name = "StartDate")
	public Date startDate;
	@Column(name = "EndDate")
	public Date endDate;
	
	public calendarScheduler(projectPhase Project, user User, Date startDate, Date endDate) {
		this.ProjectPhase=Project;
		this.User=User;
		this.startDate=startDate;
		this.endDate=endDate;
		
	}
}