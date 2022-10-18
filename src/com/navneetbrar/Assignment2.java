package com.navneetbrar;

import java.util.Random;

public class Assignment2 {

	public static void main(String[] args) {
		Random randomNumber= new Random();
		int random = randomNumber.nextInt(101);
		System.out.println(random);
		AssignmentClass assign= new AssignmentClass();
		assign.comapre(random);
		
	}

}
