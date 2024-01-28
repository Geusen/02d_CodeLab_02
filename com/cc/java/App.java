package com.cc.java;

public class App {

	public static void main(String[] args) {
	Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schulz", "Susanne", "CEO", 2001);
	
		output("-------------------------");
		output(mitarbeiter1.getInfo("#familyName"));
		output(mitarbeiter1.getInfo("#firstname"));
		output(mitarbeiter1.getInfo("#role"));
		output(mitarbeiter1.getInfo("#yearOfEntry"));
		output("-------------------------");

	Mitarbeiter mitarbeiter2 = new Mitarbeiter("Horst", "Hinterseher", "Facility Managment", 2007);
		
		output("-------------------------");
		output(mitarbeiter2.getInfo("#familyName"));
		output(mitarbeiter2.getInfo("#firstname"));
		output(mitarbeiter2.getInfo("#role"));
		output(mitarbeiter2.getInfo("#yearOfEntry"));
		output("-------------------------");



	Mitarbeiter mitarbeiter3 = new Mitarbeiter("Meier", "Marianne", "DEO", 2003);
		
		output("-------------------------");
		output(mitarbeiter3.getInfo("#familyName"));
		output(mitarbeiter3.getInfo("#firstname"));
		output(mitarbeiter3.getInfo("#role"));
		output(mitarbeiter3.getInfo("#yearOfEntry"));
		output("-------------------------");













	}
	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
