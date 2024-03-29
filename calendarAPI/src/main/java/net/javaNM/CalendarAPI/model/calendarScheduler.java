package net.javaNM.CalendarAPI.model;

import java.util.*;

import javax.persistence.CascadeType;
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
public class calendarScheduler extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "calendarScheduler_Sequence")
	@SequenceGenerator(name = "calendarScheduler_Sequence", sequenceName = "CALENDARSCHEDULER_SEQ")
	private Long id;
	
	  @JoinColumn(name = "ProjectPhase_Id", referencedColumnName = "Id", nullable =
	  false)	  
	  @ManyToOne(cascade = CascadeType.ALL) 
	  private projectPhase ProjectPhase;
	  
	  @JoinColumn(name = "User_Id", referencedColumnName = "Id", nullable = false)	  
	  @ManyToOne( cascade = CascadeType.ALL) 
	  private user User;
 	@Column(name = "StartDate")
	private Date startDate;
	@Column(name = "EndDate")
	private Date endDate;
	
	public void setUser(user User) {this.User=User;}
	public void setProjectPhase(projectPhase ProjectPhase) {this.ProjectPhase= ProjectPhase;}
	public void  setStartDate(Date startDate) {this.startDate= startDate;}
	public void  setEndDate(Date endDate) {this.endDate= endDate;}
	
	public Long getId() {return id;}
	public user getUser() {return User;}
	public projectPhase getProjectPhase() {return ProjectPhase;}
	public Date getStartDate() {return startDate;}
	public Date getEndDate() {return endDate;}
	public calendarScheduler() {}
	
	public calendarScheduler(projectPhase Project, user User, Date startDate, Date endDate) {
		this.ProjectPhase=Project;
		this.User=User;
		this.startDate=startDate;
		this.endDate=endDate;
		
	}
	
	@Override
    public String toString() {
        return "calendarScheduler [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }
}
