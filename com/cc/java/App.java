package com.cc.java;

public class App {

	public static void main(String[] args) {
	Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schulz", "Susanne", "CEO", 2001);
	
	

		// output("-------------------------");
		// output(mitarbeiter1.getInfo("#familyName"));
		// output(mitarbeiter1.getInfo("#firstName"));
		// output(mitarbeiter1.getInfo("#role"));
		// output(mitarbeiter1.getInfo("#yearOfEntry"));
		// output("-------------------------");

	Mitarbeiter mitarbeiter2 = new Mitarbeiter("Horst", "Hinterseher", "Facility Managment", 2007);
		
		// output("-------------------------");
		// output(mitarbeiter2.getInfo("#familyName"));
		// output(mitarbeiter2.getInfo("#firstName"));
		// output(mitarbeiter2.getInfo("#role"));
		// output(mitarbeiter2.getInfo("#yearOfEntry"));
		// output("-------------------------");



	Mitarbeiter mitarbeiter3 = new Mitarbeiter("Meier", "Marianne", "DEO", 2003);
		
		// output("-------------------------");
		// output(mitarbeiter3.getInfo("#familyName"));
		// output(mitarbeiter3.getInfo("#firstName"));
		// output(mitarbeiter3.getInfo("#role"));
		// output(mitarbeiter3.getInfo("#yearOfEntry"));
		// output("-------------------------");
		


	pollMitarbeiter(mitarbeiter1);
	pollMitarbeiter(mitarbeiter2);
	pollMitarbeiter(mitarbeiter3);
	}
	
	
	
	private static void pollMitarbeiter(Mitarbeiter ma) {
		output(ma.getInfo("#familyName"));
		output(ma.getInfo("#firstName"));
		output(ma.getInfo("#role"));
		output(ma.getInfo("#yearOfEntry"));
		output("-------------------------");
		

	}











	
	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
