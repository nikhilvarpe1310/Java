package com.model;

import java.util.Comparator;

public class StudentByPercentageASC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.getPercentage()>o2.getPercentage())?1:(o1.getPercentage()<o2.getPercentage())?-1:0;
	}

}
