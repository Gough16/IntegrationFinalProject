//The meaning of static is that you can call a method 
//even if you haven't created the object which it belongs to
public class MealRatio {
	// Static Fields
	static int g;
	static int b;

	static {
		g = 5;
		b = 2;
	}

	// Static methods
	public static void getMealRatio() {
		// We are using the in values of g and b to outprint information for the user
		System.out.println("You should eat healthy meals around " + g + " times a week");
		System.out.println(
				"Since you eat healthy meals " + g + " times a week, you can have a cheat meal " + b + " times a week");
	}
}
