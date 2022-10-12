package com.xworkz;

import com.xworkz.boot.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer software=new Developer();
		
		System.out.println(software.name);
		System.out.println(software.education);
		System.out.println(software.experience);
		System.out.println(software.salary);
		System.out.println(software.company);
		
		software.name="sharath gowda";
		software.education="BE mechanical engineering ";
		software.experience=15;
		software.salary=150000;
		software.company="capgemini";
		
		System.out.println(software.name);
		System.out.println(software.education);
		System.out.println(software.experience);
		System.out.println(software.salary);
		System.out.println(software.company);
		
		
		
		
		
		
		
		
		

	}

}
