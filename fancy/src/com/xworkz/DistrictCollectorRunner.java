package com.xworkz;

import com.xworkz.boot.DistrictCollector;

public class DistrictCollectorRunner {
	
	// ctrl+space
	// ctrl+c
	// ctrl+v

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration = instantiation : init non primitive : copy
		
		DistrictCollector collector=new DistrictCollector();
		
		System.out.println(collector.name);
		System.out.println(collector.age);
		System.out.println(collector.district);
		System.out.println(collector.batchnumber);
		
		collector.name="sharath";
		collector.age=26;
		collector.district="chikamaglur";
		collector.batchnumber=2016;
		
		System.out.println(collector.name);
		System.out.println(collector.age);
		System.out.println(collector.district);
		System.out.println(collector.batchnumber);
		
		
		
		
		
		
		
		
		
		

	}

}
