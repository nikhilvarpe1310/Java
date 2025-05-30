package com.demo;

import java.util.Random;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	String [] Cities = {"Mumbai", "Pune", "Nagpur", "Nashik", "Thane", "Aurangabad", "Solapur", "Amravati",
    	                           "Kolhapur", "Nanded", "Sangli", "Jalgaon", "Akola", "Latur", "Ahmednagar", "Chandrapur",
    	                           "Parbhani", "Ichalkaranji", "Dhule", "Beed", "Osmanabad", "Satara", "Wardha", "Bhandara",
    	                           "Gondia", "Ratnagiri", "Sindhudurg", "Yavatmal", "Washim", "Hingoli", "Nandurbar",
    	                           "Palghar", "Raigad", "Panvel", "Kalyan", "Dombivli", "Vasai", "Virar", "Ulhasnagar", "Bhiwandi",
    	                           "Malegaon", "Baramati", "Karad", "Jalna", "Ambajogai", "Akluj", "Manmad", "Nevasa",
    	                           "Sinnar", "Talegaon Dabhade", "Alibag", "Boisar", "Pen", "Roha", "Daund", "Shirur", "Lonar",
    	                           "Malkapur", "Parli", "Bhivandi", "Shirdi", "Rajgurunagar", "Mira-Bhayandar", "Khopoli", "Sangamner",
    	                           "Navi Mumbai", "Tumsar", "Shegaon", "Nashik Road", "Wani", "Pusad", "Vita", "Karanja",
    	                           "Pathardi", "Mukhed", "Deglur", "Nilanga", "Gadchiroli", "Shrigonda", "Satana", "Shrirampur",
    	                           "Pathri", "Lonavala", "Mahad", "Chiplun", "Dapoli", "Rajapur", "Sawantwadi", "Kudal",
    	                           "Nagothane", "Vikramgad", "Jawhar", "Talasari", "Shahada", "Chopda", "Pachora", "Varangaon",
    	                           "Mehkar", "Risod", "Ashti", "Sengaon", "Kinwat"};
    	
    	Random r = new Random();
    	for (int i=1;i<=1000;i++)
    	{
    		Student s =new Student();
    		StringBuilder sb = new StringBuilder();
    		for (int j=1;j<=15;j++)
    			sb.append((char)(r.nextInt(26)+65));
    			s.setName(sb.toString());
    			s.setCity(Cities[r.nextInt(Cities.length)]);
    			s.setPercentage(r.nextDouble()*100);
    			System.out.println(sd.insertStudent(s));
    		
    		
    	}
    	
    }
}
