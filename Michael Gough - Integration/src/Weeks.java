
public class Weeks {

	public void numberOfWeeks() {
		//Prints out a message informing the user that they should go to the gym this many times a week 
		System.out.println("In order to see good results in the gym, you should follow this: ");
		int set = 1; 
		int rep = 1;
		
		//While loop establishes how many sets the user should do (prints 1-3)
		System.out.println("You should do this many sets: ");
		while (set<4) {
			System.out.println(set);
			set++;
		}
		
		//While loop establishes how many reps the user should do (prints 1-12)
		System.out.println("You should do this many reps per set: ");
		while(rep<13) {
			System.out.println(rep);
			rep++;
		}
	}

}
