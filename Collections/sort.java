package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortDemo {
	public static void main(String args[]) {
		Emp employee1 = new Emp("Thrinath","Hyderabad",122);
		Emp employee2 = new Emp("Rajat","Delhi",124);
		Emp employee3 = new Employee("Panini","Delhi",125);
		Emp employee4 = new Employee("Pankaj","Patna",126);
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(new Emp("Sourav","Jammu",111));
		for(Emp emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, new Namesort());
		System.out.println("Sorted by Name");
		for(Emp emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp1.getCity().compareTo(emp2.getCity());
			}
			
		});
		System.out.println("Sorted by City");
		for(Emp emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, (emp1,emp2)->{
			return emp1.getEmpId().compareTo(emp2.getEmpId());
			
		});
		System.out.println("Sorted by Employee");
		for(Emp emp1 : employeeList) {
			System.out.println(emp1);
		}
		
	}

}
