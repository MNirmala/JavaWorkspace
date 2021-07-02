package com.firstwebappln.firstwebappln.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
    @GeneratedValue
    public int Id;
    @Column(name="FirstName")
    public String firstName;
    @Column(name="LastName")
    public String lastName;
    @Column(name="Email")
    public String email;
//    public void setId(int Id){
//        this.Id = Id;
//    }
//    public int getId(){
//        return this.Id;
//    }
//
//    public void setFirstName(String firstName){
//        this.firstName=firstName;
//    }
//
//    public void setLastName(String lastName){
//        this.lastName=lastName;
//    }
//
//    public String getFirstName(){
//        return this.firstName;
//    }
//
//    public String getLastName(String LastName){
//        return this.lastName;
//    }
//
//    public void setEmail(String email){
//        this.email=email;
//    }
//
//    public String getEmail(){
//        return this.email;
//    }

}
