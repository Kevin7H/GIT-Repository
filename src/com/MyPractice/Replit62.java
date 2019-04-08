package com.MyPractice;
import java.util.Scanner;
public class Replit62 {
	
	    
		 
		   public static void main(String[] args) {
		     Scanner scan=new Scanner(System.in);
		     System.out.println("Do you need a loan?");
		     boolean loan=scan.nextBoolean();

		     String elg = null;
		     int credit;

		     if (loan) {
		       System.out.println("What is your credit score?");
		       credit=scan.nextInt();
		       if (credit<600) {
			         elg="not eligible";
		       }else if (credit>=600 && credit<=700) {
		         elg="Maybe eligible";
		       } else if (credit>=701 && credit<=800) {
		         elg="Eligible";
		       } else if (credit>=801) {
		         elg="Definitely eligible";
		       }
		     } else {
		       elg="Unknown";
		     }

		    System.out.println("The eligibility is "+elg);






		   

		     }
}
	  