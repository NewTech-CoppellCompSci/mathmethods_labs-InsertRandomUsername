package labs;
import java.util.Scanner;


public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner scannyboi = new Scanner(System.in);
		System.out.println("Type 2 positive integers!");
		
		int num = scannyboi.nextInt();
		int num2 = scannyboi.nextInt();
		
		double Power = Math.pow(num, num2);
		
		System.out.println(Power);
		
	}
	
	
	
	
	public static void problem02() {
		Scanner scannyboi = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		 int num = scannyboi.nextInt();
		 
		 double squirt = Math.sqrt(num);
		 System.out.println("The square root of " + num + " is " + squirt);
		
		
	}

	
	

	public static void problem03() {
		Scanner scannyboi = new Scanner(System.in);
		System.out.println("Type the sides of a triangle");
		int sideA = scannyboi.nextInt();
		int sideB = scannyboi.nextInt();
		
		int num = sideA*sideA;
		int num2 = sideB*sideB;
		
		int sum = num + num2;
		
		double squirt = Math.sqrt(sum);
		
		System.out.println("Hypotenuse = " + squirt);
		
		

	}


	
	
	public static void problem04() {
	
			Scanner inKey = new Scanner(System.in);
			System.out.print("Enter an integer: "); 
			
			int sus = inKey.nextInt();
			int max = sus;
			int min = sus;
	
			while (sus != 0) {
				
				System.out.print("Enter an integer: "); 
				sus = inKey.nextInt();
				max = Math.max(max, sus);
				min = Math.min(min, sus);
			}

			
			System.out.println("Max = " + max  + " || Min = "+  min);
}}

	
	
	
	
	
	

