package com.collections;

import java.util.Comparator;

public class Namesort implements Comparator<Emp> {

	@Override
	public int compare(Emp emp1, Emp emp2) {
		// TODO Auto-generated method stub
		return emp1.getName().compareTo(emp2.getName());
	}
	

}
