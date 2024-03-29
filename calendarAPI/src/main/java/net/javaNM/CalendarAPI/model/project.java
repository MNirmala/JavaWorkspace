package net.javaNM.CalendarAPI.model;
import javax.persistence.CascadeType;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Projects")
public class project extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_Sequence")
	@SequenceGenerator(name = "project_Sequence", sequenceName = "PROJECT_SEQ")
	private Long id;
	@Column(name = "Project_Name")
	private String projectName;
	@Column(name = "Status")
	private String status;
	@Column(name = "StartDate")
	private Date startDate;
	@Column(name = "EndDate")
	private Date endDate;
	
	public void setName(String projname) {this.projectName=projname;}
	public void setStatus(String status) {this.status= status;}
	public void  setStartDate(Date startDate) {this.startDate= startDate;}
	public void  setEndDate(Date endDate) {this.endDate= endDate;}
	
	public Long getId() {return id;}
	public String getProjectName() {return projectName;}
	public String getStatus() {return status;}
	public Date getStartDate() {return startDate;}
	public Date getEndDate() {return endDate;}

	
	public project() {
	}
	
	public project(String name, String status, Date startDate, Date endDate) {
		this.projectName=name;
		this.status=status;
		this.startDate=startDate;
		this.endDate=endDate;
		
	}

}
