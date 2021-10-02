package FallJava;

import java.util.Scanner;

public class scannersConditionals {

	Scanner input = new Scanner(System.in);
	
	public void fourNums() {
		
	
		System.out.println("enter a num: "); 
		int num1 = input.nextInt(); 
				
		System.out.println("enter another num: "); 
		int num2 = input.nextInt(); 
			
		System.out.println("enter another num: "); 
		int num3 = input.nextInt(); 
		
		System.out.println("enter another num: "); 
		int num4 = input.nextInt(); 
		
		System.out.print(num4+""+num3+""+num2+""+num1); 
	}
		
	public void mathOperators() {
		System.out.println("say a operator: ");
		String operator = input.next();
		
		System.out.println("enter a num: "); 
		int num1 = input.nextInt(); 
		
		System.out.println("enter a num: "); 
		int num2 = input.nextInt();
		
		if (operator.equals("multiply")) {
			System.out.println(num1*num2);
		}
		else if (operator.equals("divide")) {
			System.out.println(num1/num2);
		}
		else if (operator.equals("add")) {
			System.out.println(num1+num2);
		}
		else if (operator.equals("subtract")) {
			System.out.println(num1-num2);
		}
		else if (operator.equals("modulus")) {
			System.out.println(num1%num2);
		}
		else {
			System.out.println(operator + (char)num1 + (char)num2);
			
		}
	}
			
//	public void touchdowns() {
//		System.out.println("pick a number of touchdowns:");
//		int touchdowns = input.nextInt();
//		
//		System.out.println("pick a number of field goals:");
//		int fg = input.nextInt();
//		
//		System.out.println("pick a number for total score:");
//		int ts = input.nextInt();
//		
//		I DO NOT KNOW HOW TO FINISH THIS
		
		
	public void largestNum() {
		
		System.out.println("enter a num (0-999): ");
		int num = input.nextInt();
		int ones = num%10;
		
		int tens = num%100;
		tens = tens%10;
		
		int hundreds = num;
		hundreds = hundreds%100;
		
		if (ones > tens && ones > hundreds) {
			System.out.println(ones);
		}
		if (tens > hundreds) {
			System.out.println(tens);
		}
		else {
			System.out.println(hundreds);
		
		}
	
	
	}
	public static void main(String[] args) {
		scannersConditionals runner = new scannersConditionals(); 
		runner.largestNum();
	}
}
		
