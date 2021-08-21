package net.javaNM.CalendarAPI.model;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class user extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_Sequence")
	@SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ")
	private Long id;
	@Column(name = "User_Name")
	private String userName;
	@Column(name = "Email")
	private String email;
		
	public void setUserName(String userName) {this.userName=userName;}
	public void setEmail(String Email) {this.email= Email;}
	
	public Long getId() {return id;}
	public String getUserName() {return userName;}
	public String getEmail() {return email;}
	

}
