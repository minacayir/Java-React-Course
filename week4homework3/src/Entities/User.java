package Entities;

import Abstract.IEntity;

public class User implements IEntity{
 private int id;
 private String email;
 
 
 public User() {
	 
 }


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public User(int id, String email) {
	super();
	this.id = id;
	this.email = email;
}
 

 
 
 
}
