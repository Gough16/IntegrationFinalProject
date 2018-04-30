//We will display the name of me(the programmer)
//as a trainer and the guide for who will help 
//along the program
public class Trainer {

	public void yourTrainer() {
		String myName = "Michael"; 		
		
		
		//here, we are handling an exception that way 
		//the code will continue to run after I print out my string name and
		//will continue the program until my full name is printed for the user to see
		try {
			System.out.println(myName.length()); 
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("String is Michael");
		}
		
		//Outprints the name of the trainer that way the user
		//Feels like the program responds to them like a normal individual would
		String myLastName = " Gough";
		String myFullName = myName + myLastName;
		System.out.println("My full name is = "+myFullName);
	}
	
}
