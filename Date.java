
public class Date {
	int day;
	int month;
	int year;

	public void setDate(int tmpday, int tmpmonth, int tmpyear) {

		year = tmpyear;
		month = tmpmonth;
		day = tmpday;

		
		if ((tmpyear % 4 == 0 && tmpyear % 100 != 0) || tmpyear % 400 == 0) {
			if (tmpmonth == 2) {

				if (tmpday < 1 || tmpday > 29)
					System.out.println("Invalid Date please enter a correct date");

				else
					day = tmpday;

			}

		} else {
			if (tmpmonth == 1 || tmpmonth == 3 || tmpmonth == 5 || tmpmonth == 7 || tmpmonth == 8 || tmpmonth == 10
					|| tmpmonth == 12) {
				if (tmpday < 1 || tmpday > 31)
					day = 1;
				else
					day = tmpday;

			} else if (tmpmonth == 4 || tmpmonth == 6 || tmpmonth == 9 || tmpmonth == 11) {
				if (tmpday < 1 || tmpday > 30)
					day = 1;
				else
					day = tmpday;

			}
			else if (tmpmonth ==2) {
				if (tmpday < 1 || tmpday > 28)
					day = 1;
				else
					day = tmpday;
			}

		}

	}

	

	
	 public static void addDays(int exDay, int tmpday, int tmpmonth, int tmpyear) {
	        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        if ((tmpyear % 4 == 0 && tmpyear % 100 != 0) || (tmpyear % 400 == 0)) {
	            daysInMonth[1] = 29; 
	        }
	        else {
	        	daysInMonth[1] = 28; 
	        }
	        	
	        int totalDays = tmpday + exDay;
            
	        while (totalDays > daysInMonth[tmpmonth - 1]) {
	            totalDays -= daysInMonth[tmpmonth - 1];
	            tmpmonth++;

	            if (tmpmonth > 12) {
	                tmpmonth = 1;
	                tmpyear++;
	                
	            }
	        }
	        
	        
	        
	        System.out.println(totalDays+"/"+tmpmonth+"/"+tmpyear);
	 }
	  
	 
	 
	 public static void addMonths(int exMonth, int tmpday, int tmpmonth, int tmpyear) {
		 int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        if ((tmpyear % 4 == 0 && tmpyear % 100 != 0) || (tmpyear % 400 == 0)) {
	            daysInMonth[1] = 29; 
	        }

	        int finalMonth = tmpmonth + exMonth;
	        while (finalMonth > 12) {
	            finalMonth -= 12;
	            tmpyear++;
	        }

	        if (tmpday > daysInMonth[finalMonth - 1]) {
	            tmpday = daysInMonth[finalMonth - 1];
	        }

	        System.out.println(tmpday + "/" + finalMonth + "/" + tmpyear);
	 }
	 
	 
	 public static void addYears(int exYear, int tmpday, int tmpmonth, int tmpyear) {
		 int finalYear =0;
		 finalYear = tmpyear + exYear;
		 
		 System.out.println(tmpday+"/"+tmpmonth+"/"+ finalYear);
	 }
	 
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}

