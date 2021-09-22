package FallJava;

public class OperationsWorksheet {

		public void numToChar(int x) {
			System.out.println((char)x);
		}
		public void lastDigit(int x) {
			System.out.println(x % 10);
		}	
		public void exactAverage(double x, double y) {
			System.out.print(x * y /2);
		}
		public static void main(String[] args) {
			
			OperationsWorksheet runner = new OperationsWorksheet();
			
			runner.numToChar(1000);
			runner.lastDigit(0);
			runner.exactAverage(2,3);
		}
}
