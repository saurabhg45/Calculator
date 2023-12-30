package com.java.SimpleCalculator;
import java.util.*;


public class Simple_Calculator {
	public static void main(String[] args) {
		System.out.println("======================================================================");
		System.out.println("--------------Well Come TO Simple Calculator--------------");
		System.out.println("======================================================================");
		Scanner sc = new Scanner(System.in);
		
		String ch;
		
		do {
			System.out.println("Select Following Options...");
			System.out.println();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("6. Square");
			System.out.println("7. Square Root");
			
			System.out.println();
			System.out.print("Enter The Option : ");
			int option = sc.nextInt();
			
			switch(option) {
			case 1 : System.out.print("Enter First No. : ");
			         int a = sc.nextInt();
			         System.out.print("Enter Second No. : ");
			         int b = sc.nextInt();
			         int result = a+b;
			         System.out.println("The Addition is : " + result);
			         break;
			         
			case 2 : System.out.print("Enter First No. : ");
			         int x = sc.nextInt();
			         System.out.print("Enter Second No. : ");
			         int y = sc.nextInt();
			         int sub = x-y;
			         System.out.println("The Subtraction is : " + sub);
			         break;
			         
			case 3 : System.out.print("Enter First No. : ");
			         int m = sc.nextInt();
			         System.out.print("Enter Second No. : ");
			         int n = sc.nextInt();
			         int mul = m*n;
			         System.out.println("The Multiplication is : " + mul);
			         break;
			         
			case 4 : System.out.print("Enter First No. : ");
			         int i = sc.nextInt();
			         System.out.print("Enter Second No. : ");
			         int j = sc.nextInt();
			         if(j != 0) {
			        	 double div = i/(double)j;
				         System.out.println("The Division is : " + div);
			         }
			         else {
			        	 System.out.println("Error: Can't devide by Zero(0). ");
			         }
			         
			         break;
			         
			case 5 : System.out.print("Enter First No. : ");
			         int s = sc.nextInt();
			         System.out.print("Enter Second No. : ");
			         int r = sc.nextInt();
			         double mod = s%r;
			         System.out.println("The Modulo is : " + mod);
			         break;
			         
			case 6 : System.out.print("Enter No. : ");
			         int S = sc.nextInt();
			         int squre = S*S;
			         System.out.println("The Square is : " + squre);
			         break;
			case 7 : System.out.print("Enter No. : ");
			         double d = sc.nextDouble();
			         if(d>=0) {
			        	 double sroot = Math.sqrt(d);
			        	 System.out.println("The Square Root is : " + sroot);
			         }
			         else {
			        	 System.out.println("Error: Can't find Square Root of Negative No.");
			         }
			         
			         break;
			         
			default: System.out.println("Enter Valid Option : " + option);
			
			}
			
			System.out.print("Do you want to continue (Y/N) : ");
			ch = sc.next();
		}
		while(ch.equals("Y") || ch.equals("y"));
		System.out.println("Program terminated. Thank you!");
		sc.close();
	}

}
