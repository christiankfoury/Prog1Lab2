import java.util.*;
public class BMI
{	public static void main(String[] args) {
		// Scanner called kb (keyboard)
		Scanner kb = new Scanner(System.in);
		
		// Ouput question 
		System.out.println("Enter your weight in pounds:");
		double pounds = kb.nextDouble();
		
		System.out.println("Enter you height in feet");
		double feet = kb.nextDouble();

		// Conversion of weight in pounds into weight in kilograms
		double kilograms = pounds / 2.2;
		// Conversion of height in feet into meters
		double meters = feet / 3.281;

		// BMI formula
		double bmi = kilograms / (meters * meters);

		// Output BMI 
		System.out.println("Your BMI is: " + bmi);




}
}