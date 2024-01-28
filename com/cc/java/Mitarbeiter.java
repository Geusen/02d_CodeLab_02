package com.cc.java;

public class Mitarbeiter {
	
	private String familyName ;
	private String firstName;
	private String role ;
	private int yearOfEntry ;
	
	public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.role = role;
		this.yearOfEntry = yearOfEntry;
	}


	public String getInfo(String opInfo) {
		switch (opInfo) {
			case "#familyName":
				return familyName;	
			case "#firstname":
				return firstName;
			case "#role":
				return role;
			case "#yearOfEntry":
				return String.valueOf(yearOfEntry);
			default:
				return "error getInfo"; 
		}
		
	}

}
