
public class LambdaP {

	public void predicate() {
		//Outprints a message for the user to know that the fluids being printed in a list below
		//are healthy for daily consumption
		System.out.println("These are the Fluids that you should drink on a daily basis: ");

		// Anonymous Runnable
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Water");
			}
		};

		// Lambda Runnable
		//List of drinks that are healthy for daily consumption 
		Runnable r2 = () -> System.out.println("Apple Cider");
		Runnable r3 = () -> System.out.println("Almond Milk");
		Runnable r4 = () -> System.out.println("Orange Juice");
		Runnable r5 = () -> System.out.println("Green Tea");
		Runnable r6 = () -> System.out.println("Tomato Juice");



		
		// Run these
		//This will run the 6 runnables that are listed about 
		r1.run();
		r2.run();
		r3.run();
		r4.run();
		r5.run();
		r6.run();
	}
}
