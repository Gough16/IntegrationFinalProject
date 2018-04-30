import java.util.Scanner;
//This is our BMI class, where we will print out the users BMI 
//Based on the information they inputed from the UserInput class
public class BodyMassIndex {
	private int var;
	double weight;
	double height;
	double bmi;

	// In this class we will find the users BMI and calculate that to get them to
	// See where they're at now so when they use the program again they can see
	// where

	public void getUserBMI(Scanner scanner) {
		
		//Gets users weight
		System.out.println("What is your weight in pounds? ");
		weight = scanner.nextInt();
		
		//Gets users height in inches
		System.out.println("What is your height in inches? ");
		height = scanner.nextInt();

		//convert weight into kilograms and height into meters
		double weightChange = weight * 0.453592;
		double heightChange = height * 0.0254;
		bmi = weightChange/Math.pow(heightChange, 2.0);
		
		//Print output of bmi
		System.out.printf("Your Body Mass Index is " +bmi+ " ");
		
		//Looking at this from the perspective of what a bmi should be 
		if (bmi < 18.5) {
			System.out.println("You're underweight. ");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("You're at the normal weight range. ");
		} else if (bmi >= 25 && bmi < 30){
			System.out.println("You're overweight");
		} else if (bmi>= 30) {
			System.out.println("You're obese. "); 
		}
	}
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
}
