package FallJava;

public class IfStatements {
	
	public void positive(int x) {
			if (x > 0) {
				System.out.println("positive");
			}
			else if (x < 0) {
				System.out.println("negative");
				}
			else {
				System.out.println("zero");
			}
	}		
	public void evenOdd(int x) {
			if (x % 2 == 0) {
				System.out.println("even");
			}
			else if (x % 2 == 1) {
				System.out.println("odd");
				}
			else {
				System.out.println("zero");
			}
	}
	
	public void upperlower(char x) {
		
		if (x > 64 && x < 91) {
			System.out.println("Uppercase");
		}
		else if (x > 96 && x < 121) {
			System.out.println("Lowercase");
		}	
		else
			System.out.println("Neither");
	}
	
	public void ten(int x) {
		
		if (x % 10 == 0) {
			System.out.println("Multiple of ten");
		}	
		else
			System.out.println("Not a multiple");
	}
	
	public void maxFunction(double x, double y, double z) {
		
		if (x > y && y > z) {
			System.out.println("X is the biggest");
		}
		else if (y > z && z > x) {
			System.out.println("Y is the biggest");
		}	
		else
			System.out.println("Z is the biggest");
	}
	
	public static void main(String[] args) {
	IfStatements runner = new IfStatements();
		
		runner.positive(5);
		
		runner.evenOdd(9);
		
		runner.upperlower('g');
		
		runner.ten(7);
		
		runner.maxFunction(5,6,8);
		
	
		
		
		

	}
}
