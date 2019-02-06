package com.jst.skillsinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "USERS", 
        uniqueConstraints = { 
                @UniqueConstraint(name = "USERS_UK", columnNames = "USER_NAME") })
public class Users {
 
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;
 
    @Column(name = "USER_NAME", length = 25, nullable = false)
    private String userName;
    
    @Column(name = "FIRST_NAME", length = 25, nullable = false)
    private String firstName;
    
    @Column(name = "LAST_NAME", length = 50, nullable = false)
    private String lastName;
 
 
	@Column(name = "ENCRYPTED_PASSWORD", length = 128, nullable = false)
    private String encrytedPassword;
 
    @Column(name = "ENABLED", length = 1, nullable = false)
    private boolean enabled;
 
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getFirstName() {
 		return firstName;
 	}

 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}

 	public String getLastName() {
 		return lastName;
 	}

 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}

    public String getEncrytedPassword() {
        return encrytedPassword;
    }
 
    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }
 
    public boolean isEnabled() {
        return enabled;
    }
 
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
 
}