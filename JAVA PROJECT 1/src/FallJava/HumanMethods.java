package FallJava;

public class HumanMethods {
	
	public int age;
	public char gender;

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public void canVote() {
	
		if (age < 18) {
			System.out.println("Can not vote");
	}
		else if (age > 18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Can vote");
	}
	
	
	public void tetanusShot() {
		
		if (age % 4 == 0) {
			System.out.println("Needs Tetanus Shot");
		}
		else {
			System.out.println("Does not need Tetanus Shot");
	}
	
	public void toddler() {
		
		if ((age < 4) && (gender == 'g')) {
			System.out.println("Toddler girl");
			
		else if ((age < 4) && (gender == 'b')) {
			System.out.println("Toddler boy");
			
		else {
			System.out.println("Not a toddler")
			
	
	public void movieDiscount() {
				
		if (age >= 65) {
			System.out.println("You get Discount");
					
		else if (age <= 12) {
			System.out.println("You get Discount");
					
		else {
			System.out.println("No discount")
			
	
	public void teenager() {
				
		if (12 <= age && age <= 18) {
			System.out.println("Teenager");
		
		else {
			System.out.println("Not a teenager")
	
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		Human runner = 
	}
		
		

	}
}
