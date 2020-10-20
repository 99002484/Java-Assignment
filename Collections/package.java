package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp employee1 = new Emp("Thrinath","Hyderabad",122);
		Emp employee2 = new Emp("Rajat","Delhi",124);
		Emp employee3 = new Emp("Panini","Delhi",125);
		Emp employee4 = new Emp("Pankaj","Patna",126);
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		for(Emp emp : employeeList) {
			System.out.println(emp);
		}
		Collections.sort(employeeList);
		System.out.println("Sorted List");
		for(Emp emp : employeeList) {
			System.out.println(emp);
		}
		
	}
}
