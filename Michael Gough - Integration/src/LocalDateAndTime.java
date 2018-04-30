import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateAndTime {

	
	//This Method will allow us to print out the current date in the program
	public void getLocalDate() {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}
	
	//And this method allows us to print out the current time in our program
	public void getLocalTime() {
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
