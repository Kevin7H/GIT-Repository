package com.class14;
import java.util.Scanner;
public class HW {
	public static void main(String[] args) {
		Scanner scan;
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mother's name");
		motherName=scan.nextLine();
		System.out.println("Please enter father's name");
		fatherName=scan.nextLine();
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		switch(gender){
        
        case "girl":
            babyName=(motherName.substring( 0,motherName.length()/2)+fatherName.substring(fatherName.length()/2));
            break;
        case "boy":
            babyName=(fatherName.substring(0,fatherName.length()/2)+motherName.substring(motherName.length()/2));

            
		break;
		
	}
System.out.println(babyName);
}
}
