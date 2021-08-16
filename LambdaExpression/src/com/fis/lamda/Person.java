package com.fis.lamda;

import java.util.List;

public class Person {
	
	public static void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}

	private void printPerson() {
		// TODO Auto-generated method stub
		
	}

	private int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
