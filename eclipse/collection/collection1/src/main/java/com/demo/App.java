package com.demo;

import java.util.Scanner;
import java.util.TreeSet;

import com.model.Student;
import com.model.StudentByCityASC;
import com.model.StudentByCityDESC;
import com.model.StudentByIdASC;
import com.model.StudentByIdDESC;
import com.model.StudentByNameASC;
import com.model.StudentByNameDESC;
import com.model.StudentByPercentageASC;
import com.model.StudentByPercentageDESC;


public class App 
{
    public static void main( String[] args )
    {
        TreeSet<Student> t =null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sorting option:");
        System.out.println("0. ID Ascending");
        System.out.println("1. ID Descending");
        System.out.println("2. Name Ascending");
        System.out.println("3. Name Descending");
        System.out.println("4. City Ascending");
        System.out.println("5. City Descending");
        System.out.println("6. Percentage Ascending");
        System.out.println("7. Percentage Descending");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {

        case 0:
        	t = new TreeSet(new StudentByIdASC());
        	break;
        case 1:
        	t = new TreeSet(new StudentByIdDESC());
        	break;
        case 2:
        	t = new TreeSet(new StudentByNameASC());
        	break;
        case 3:
        	t = new TreeSet(new StudentByNameDESC());
        	break;
        case 4:
        	t = new TreeSet(new StudentByCityASC());
        	break;
        case 5:
        	t = new TreeSet(new StudentByCityDESC());
        	break;
        case 6:
        	t = new TreeSet(new StudentByPercentageASC());
        	break;
        case 7:
        	t = new TreeSet(new StudentByPercentageDESC());
        	break;
        }
        t.add(new Student(1,"Nikhil","Sangamner",90.85));
        t.add(new Student(5,"Saurabh","Nagpur",96.85));
        t.add(new Student(3,"Mohit","Solapur",80.85));
        t.add(new Student(2,"Soham","Peth",91.85));
        t.add(new Student(12,"Mahendra","Pune",75.85));
        t.add(new Student(10,"Guru","Kolhapur",85.85));
        for(Student s:t)
        	System.out.println(s);
    }
}