package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
	//	problem01();
	//	problem02();
	//	problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int amon = inKey.nextInt();
		
		System.out.println("Enter another integer");
		
		int gus = inKey.nextInt();
		
		
		int max = Math.max(amon, gus);
		int min = Math.min(amon, gus);
		
		for (int i = 10; i > 0;) {
			
			int total = (int)(Math.random()* (max - min+1)+ min);
			System.out.println(total);
			i--;
		}
		
	}
	
	
	
		
		
	
	

	public static void problem02() {
		
		// inputs for the radius and height of cylinder
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter the radi(s)us of the cylinder");
		int Radisus= inKey.nextInt();
		System.out.println("Enter the height of the cylinder");
		int hiht = inKey.nextInt();
		
		// calculates the volume using Pi
		double base = Math.PI * (Radisus * Radisus);
		double ans = base * hiht;
		
		System.out.println("The Volume of the Cylinder is: " + ans);
		
	}

	
	

	public static void problem03() {
		
		Scanner mogus = new Scanner(System.in);

		
		

		// x and y value points input
		System.out.print("Enter x1: "); 
		double xVal1 = mogus.nextDouble();
		System.out.print("Enter y1: "); 
		double yVal1 = mogus.nextDouble();
		System.out.print("Enter x2: "); 
		double xVal2 = mogus.nextDouble();
		System.out.print("Enter y2: "); 
		double yVal2 = mogus.nextDouble();

		//gets result
		System.out.println("The distance between them is "+Math.sqrt( (Math.pow((xVal1-xVal2), 2) + (Math.pow((yVal1-yVal2), 2)) ) ));
	}
	
	
	public static void problem04() {

		
		Scanner pablo = new Scanner(System.in);
		//gets the inputs of a, b, and c
		System.out.print("enter a: ");
		double a = pablo.nextDouble();
		System.out.print("enter b: ");
		double b = pablo.nextDouble();
		System.out.print("enter c: ");
		double c = pablo.nextDouble();
		
		// caluclates the quadratic formula
		
		double Scott = (-1*b + Math.sqrt(Math.pow(b, 2) -4*a*c)) / (2*a);
		double Mescudi =(-b-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		// prints out calculated answer
		System.out.println("x1 = " + Scott);
		System.out.println("x2 = " + Mescudi );
	}
}

	
	

	

