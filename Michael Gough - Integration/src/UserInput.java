import java.util.Scanner;

//This is our User input class where we will be asking for
//the users name and age
public class UserInput {
	// int - int data type is a 32-bit signed two's complement integer
	// byte - useful for saving memory in large arrays
	// short - save memory in large arrays, in situations where the memory savings
	// actually matters
	// long - a 64-bit two's complement integer
	// float - save memory in large arrays of floating point numbers
	// double - decimal values, this data type is generally the default choice
	// boolean - two possible values: true and false
	// char - a single character data type
	// Variable - a piece of memory that can contain a data value
			

	
	//Method getname, asking for users name
	public void getName(Scanner scanner, String name) {
		//Below our system output is our call asking the user for their name
		System.out.println("What is your name? ");
		name = scanner.nextLine();	
		
		//Then our argument is to our call is below, putting the name in a sentence 
		StringBuilder nm = new StringBuilder(name);
		nm.reverse(); 
		System.out.println("Hello, "+name.toUpperCase()+" How old are you " +nm+"?");
	}

	//Our method getAge is declared below with scanner and int age as the parameters
	public void getAge(Scanner scanner, int age) {
		age = scanner.nextInt();	
		System.out.println("You're "+age+" years old!");
	}
	

}



