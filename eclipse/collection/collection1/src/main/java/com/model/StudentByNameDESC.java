package com.model;

import java.util.Comparator;

public class StudentByNameDESC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -o1.getName().compareTo(o2.getName());
	}

}
