//Our class values will have an array of values 
//and will print out the index, sum, and min value!


public class Values {
	public void ourValues(String[] args) {
		//This will outprint the index of numbers in the array about the numbers
		System.out.println("index");
		//This is our array of numbers
		int numbers[] = {33, 19, 30, 7, 12, 55, 29};
		int sum = 0;
		int smallest = numbers[0];
		
		//This first for loop will print out our index of numbers
		for (int counter = 0; counter < numbers.length; counter++) {
			System.out.println(counter);
		}

		//This second index will allow us to print out the sum of our numbers in the array
		for (int counter = 0; counter < numbers.length; counter++) {
			sum += numbers[counter];
		}
		//Outprints the sum of our array list
		System.out.println("The sum of these numbers are: " + sum);
		
		//The last array is printing out the minimum value in our list
		for (int counter = 0; counter < numbers.length; counter++) {
			if(numbers[counter] < smallest){
				smallest = numbers[counter];
			}
		}
		//Outprints our smallest value in the array list
		System.out.println("The smallest value here is: "+smallest);
	}


}
