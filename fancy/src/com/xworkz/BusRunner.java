package com.xworkz;

import com.xworkz.boot.Bus;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus bus1=new Bus();
		System.out.println(bus1.number);
		System.out.println(bus1.starting);
		System.out.println(bus1.destination);
		
		bus1.number="KA 18 F 148";
		bus1.starting="tumkur";
		bus1.destination="chikamagalur";
		
		System.out.println(bus1.number);
		System.out.println(bus1.starting);
		System.out.println(bus1.destination);
		

	}

}
