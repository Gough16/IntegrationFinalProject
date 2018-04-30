import java.util.Scanner;

//Michael Gough
//This is my integration project that will cover 
//The skills that I learn throughout this semester 
//The Goal of this program is to get the users information
//and relay a message for the users Body Mass Index and to 
//Show them some good and bad foods that they should be aware of when 
//making healthy decisions 

class Main {

	// This is our main method
	public static void main(String[] args) {
		//We have out scanner object here at the very beginning of the program
		Scanner scanner = new Scanner(System.in);
		
		//Output a string that welcomes the user to the program (user friendly greeting)
		String s = "Hello, and welcome to my program for a healthier lifestyle!";
		
		//This output will take our string "s" with our welcoming statement and put it in all caps
		System.out.println(s.toUpperCase());
		
		//This line of code will append our text "up for the challenge" to the end of our
		//"our you" string after it has been printed on the screen already
		StringBuilder a = new StringBuilder("are you... ");
		System.out.println(a);
		a.append("up for the challenge?");
		System.out.println(a);
		
		Start step1 = new Start();
		Trainer step2 = new Trainer(); //This is out trainer class, makes the program seem more one on one
		UserInput step3 = new UserInput(); //Gets user input (name, age, weight, and height)
		BodyMassIndex step4  = new BodyMassIndex(); //Calculates BMI for the user
		LocalDateAndTime step5 = new LocalDateAndTime(); //Prints out the local date and time
		MealRatio step6 = new MealRatio(); //Static Fields and Methods
		Foods step7 = new Foods(); //We relay good and bad foods the user should keep in mind (polymorphism)
		Values step8 = new Values(); //Class used to calculate index sum and min value 
		Exercise step9 = new Exercise(); ///superclass doExercise that gets overriden with subclasses
		Physical step10 = new Physical(); //The use of a for each loop
		Weeks step11 = new Weeks(); //While loop used in this class
		LambdaP step12 = new LambdaP(); //Use of lambda expression to inform the user on daily intake of healthy fluids
		Weights step13 = new Weights(); //Constructors, set and get methods used
		
		step1.getStarted();
		
		//Checked Exception Handled
		step2.yourTrainer();
		
		step3.getName(scanner, null);
		step3.getAge(scanner, 0);
		
		step4.getUserBMI(scanner);
		
		//Prints out local date and time for the user
		System.out.println("Here is the local date and time for your location right now: ");
		step5.getLocalDate();
		step5.getLocalTime(); 
		
		//Static Methods
		step6.getMealRatio();
		
		//The example of Polymorphism
		step7.intake(); 
		//Make an array object called list that takes on the Food class 
		Foods user[] = new Foods[2];
		user[0]=new BadFood();
		user[1]=new GoodFood();
		
	
		for(int x=0;x<2;++x) {
			user[x].intake();
		}
				
		
		step8.ourValues(args);
		
		step9.doExerciseRun(); //We will override our method in this step
		Exercise running = new Exercise_Running(); 
		//We print out our new value that override our original value 
		//because our methods are the same but its just an updated value
		System.out.println("You should run approximately " + running.doExerciseRun() + " miles a week.");
		
		//Array of strings used with a for each loop to outprint on the screen 
		step10.bePhysical(); 
		
		step11.numberOfWeeks();
		
		//Lambda Expression used in this step
		step12.predicate();
				
		step13.liftWeights();
		
		
		Weights WeightObject = new Weights(55,4,15);
		System.out.println("This is the weight, sets, and rep amounts you should do to start off: ");
		System.out.printf("%s%n", WeightObject.liftWeights());
		
		
		//Display a friendly exit message for the user
		System.out.println("Thank you for using my program");
		System.out.println("Come back when you have made some changes!");
		
					
	}
}
	


