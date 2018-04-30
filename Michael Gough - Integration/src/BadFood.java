//BadFood extends is a subclass to its superclass Foods
public class BadFood extends Foods { 
	//extends tells us that we are inheriting from the Foods class
	public void intake() {
		//Print out a list of foods that aren't healthy for people
		System.out.println("When making healthy decisions!"); //We are overriding the original code from Foods here
		//Prints out these foods aren't good for you and then has a list of bad foods underneath it
		System.out.println("These are foods that aren't good for you: ");
		System.out.println("Fruit Juice");
		System.out.println("Soy Protein");
		System.out.println("Sugar Alcohols");
		System.out.println("Farmed Fish");
		System.out.println("Microwave Popcorn");
		System.out.println("Factory-Farmed Meat");
		System.out.println("Margarine");
		System.out.println("Shrimp");
		System.out.println("Vegetable Oils");
		System.out.println("Table Salt");
		System.out.println("Artificial Sweeteners");
		System.out.println("Pancakes");
	}
}
