package com.calculator;

import java.util.Scanner;

import com.addition.Additions;
import com.average.Averages;
import com.cube.Cubes;
import com.division.Divisions;
import com.even.Evens;
import com.factors.Factorss;
import com.modulus.Moduluss;
import com.multiplication.Multiplications;
import com.square.Squares;
import com.substraction.Subtractions;

public class Calculator1 {
	

	
public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag){
			System.out.println("Welcome to console based application\n"+
			        "1. Addition of two number\n" + 
					"2. Subtraction of two number\r\n" + 
					"3. Multiplication of two number\r\n" + 
					"4. Division of two number\r\n" + 
					"5. Modulus of two number\r\n" + 
					"6. Square of number\r\n" + 
					"7. Cube of number\n"+ 
					"8. Average of numbers\r\n" + 
					"9. Factors of numbers\r\n" + 
					"10.Find out even or odd number");
			

			int number =0;

					while(true) {
						try {
							System.out.println("Enter number From 1 to 10 Which operation you want to perform :");
							number = sc.nextInt();
							if(number < 1 || number >10) {
								throw new ArithmeticException();
							}
							break;

						}catch(ArithmeticException e) {
							System.out.println("Enter the int data between 1 to 10 ");
							
						}
						catch(RuntimeException e) {
//							e.printStackTrace();
							System.out.println("Expecting int type data ");
							System.out.println("Enter the int data between 1 to 10 ");
							sc.next();

						}
					}
					switch (number) {
					
					case 1:
						Additions add = new Additions();
						add.getAddition();
						break;
					
					case 2:
						Subtractions sub = new Subtractions();
						sub.getSubtraction();
						break;
					
					case 3:
						Multiplications mul = new Multiplications();
						mul.getMultiplications();
						break;
					
					case 4:
						Divisions div = new Divisions();
						div.getDivision();
						break;
					
					case 5:
						Moduluss mod = new Moduluss();
						mod.getModulus();
						break;
					
					case 6:
						Squares sq = new Squares();
						sq.getSquare();
						break;
					
					case 7:
						Cubes c = new Cubes();
						c.getCube();
						break;
					
					case 8:
						Averages avg = new Averages();
						avg.getaverage();
						break;
					
					case 9:
						Factorss fac = new Factorss();
						fac.getFactors();
						break;
					
					case 10:
						Evens ev = new Evens();
						ev.getEven();
						break;
						
						default :
							System.out.println(number +" This option is not avaiable ");
							System.out.println("Select number between 1 to 10");
							break;
		
		}
					System.out.println("___________________________________________");
					while(true) {
						System.out.println("Do you want to perform more calculation :");
						System.out.println("Enter yes or no");
						String ans = sc.next();
						
						if(ans.equalsIgnoreCase("yes")) {
							flag = true;
							break;
						}
						else if(ans.equalsIgnoreCase("no")) {
							System.out.println("Thank you");
							flag = false;
							break;
						}
					}
					
		
		
		
		
		}

}
}
	
	


