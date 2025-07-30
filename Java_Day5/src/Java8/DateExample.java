package Java8;

import java.time.LocalDate;
import java.time.Period;

public class DateExample {

	public static void main(String[] args) {
		LocalDate joiningDate = LocalDate.of(2020, 1,15);
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(joiningDate, currentDate);
		
//		System.out.println("Years Of Service:"+period.getYears());
		System.out.println("Years Of Service:"+period.getYears());
		System.out.println("Months Of Service:"+period.getMonths());
		System.out.println("Days Of Service:"+period.getDays());
		
	}

}


