
public class Entry {

	public static void main(String [] args) {
		System.out.println("Enter the date :");
		int day = ConsoleInput.getInteger();

		System.out.println("Enter the month :");
		int month = ConsoleInput.getInteger();

		System.out.println("Enter the year :");
		int year = ConsoleInput.getInteger();

		Date objDate = new Date();

		
		if(day>31 || day<1 || month >12 || month <1 || year > 9999 || year < 1000) {
			System.out.println("Invalid Date please enter a correct date");
		}
		else {
			objDate.setDate(day, month, year);
			System.out.println("Date: " + objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
		

		
	    int choice=0;
		
		do {

		System.out.println("Enter your choice");
		System.out.println("1. Add Days");
		System.out.println("2. Add Months");
		System.out.println("3. Add Years");
		System.out.println("4. Exit");
		
	
		choice=ConsoleInput.getInteger();
		switch (choice) {
		case 1:
			System.out.println("enter add date...!!");
			int day1 = ConsoleInput.getInteger();
			objDate.addDays(day1, day, month, year);
			break;
		case 2:
			System.out.println("enter add month...!!");
			int month1 = ConsoleInput.getInteger();
			objDate.addMonths(month1, day, month, year);
			break;
		case 3:
			System.out.println("enter add year...!!");
			int year1 = ConsoleInput.getInteger();
			objDate.addYears(year1, day, month, year);
			break;
		case 4:
			System.out.println("Exited Successfully");
			break;
			
			
	
		}
		}while(choice!=4);
		}
	}
}
