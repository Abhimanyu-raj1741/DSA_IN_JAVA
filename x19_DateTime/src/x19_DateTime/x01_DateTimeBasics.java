package x19_DateTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;

public class x01_DateTimeBasics {
	public static void main(String[] args) {
            
		List<Integer> ls = Arrays.asList(11,2,4);

		LocalDate Enddate = LocalDate.now();
		String str = "1997-Oct-04";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");

		LocalDate startDate =  LocalDate.parse(str,formatter);

		System.out.println(startDate.format(formatter));
		LocalDate endDate  =  startDate.plusYears(3).plusMonths(2).plusDays(2);
		// date.formate() convert date into String 
		// date.parse() convert String into date ;



		System.out.println(endDate.format(formatter));


        
		// Find date lie between Range or not
		LocalDate currDate = LocalDate.of(2012, 12, 01);

		if(!currDate.isBefore(startDate) && !currDate.isAfter(endDate)) {
			System.out.println("Date in Range");
		}
		else {
			System.out.println("Date is not in Range");
		}

		// Find Difference between two dates 
		Period period  = Period.between(startDate, endDate);
		System.out.println(period.getDays() + " Days");
		System.out.println(period.getMonths()+ " Months");

		System.out.println(period.getYears()+ " Years");


		// Count the days startDate to endDate
		System.out.println(ChronoUnit.YEARS.between(startDate,LocalDate.now()));
		
		

		//Find Day of the week 
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(startDate.getDayOfWeek());

		// Find Age using Period     
		System.out.println(Period.between(startDate, LocalDate.now()).getYears());

		// Check Leap Year  
		if(startDate.isLeapYear()) {
			System.out.println(" Is Leap Year");
		}
		else {
			System.out.println( " Is not Leap Year ");
		}
		// Get First/Last Day of Month 
		System.out.println(LocalDate.now().withDayOfMonth(1));
		System.out.println(LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth()));

		// -----------------------------------------AdVanced---------------------------
		System.out.println("-------------------------------------");

		// LocalDate 
		LocalDate ld = LocalDate.now();

		System.out.println(ld);

		// LocalTime
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		// LocalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate of = LocalDate.of(2026, 04, 1);
		System.out.println(of );

		LocalDate ofYearDay = LocalDate.ofYearDay(2026, 210);
		System.out.println(ofYearDay);

		System.out.println("plusDays : "+ ld.plusDays(2));
		System.out.println("plusMonths "+ld.plusMonths(2));
		System.out.println("minusDays :"+ld.plusYears(3));
		System.out.println("withYear :"+ld.withYear(2018));
		System.out.println("with ChronoField :"+ ld.with(ChronoField.YEAR,2024));
		System.out.println("wiht Temporal Adjuster :"+ld.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println();


		LocalTime localTime = LocalTime.now();
		LocalTime localTime1 = LocalTime.of(15, 15);
		System.out.println(localTime1);
		System.out.println("15 -15 ");
		LocalTime localTime2 = LocalTime.of(15, 15,12);
		System.out.println(localTime2);

		//Getting values from local time instance 

		System.out.println(" get Hours "+ localTime.getHour());
		System.out.println(" get Hours "+ localTime.getMinute());
		//		     for(int i=0;i<60;i++) {
		////		    	  try {
		////					//TimeUnit.SECONDS.sleep(1);
		////					System.out.println(i);
		////				  } catch (InterruptedException e) {
		////					// TODO Auto-generated catch block
		////					e.printStackTrace();
		////				  }
		////		    	     
		////		     }

		System.out.println(localTime1.get(ChronoField.CLOCK_HOUR_OF_AMPM));

		System.out.println(localTime.minus(2,ChronoUnit.HOURS));
		System.out.println(localTime.plus(2,ChronoUnit.HOURS));
		System.out.println("MIDNIGHT "+localTime.with(LocalTime.MIDNIGHT));
		System.out.println("HOURS DAY "+localTime.with(ChronoField.HOUR_OF_DAY,22));

		// Converting LocalDate, LocalTime to LocalDateTime

		LocalDate localDate = LocalDate.of(2025,04,11);
		System.out.println(localDate.atTime(1,33));
		LocalTime localTime4 = LocalTime.of(17,27);
		System.out.println(localTime4.atDate(localDate));
 
		 System.out.println("------------------------DURATION------------------------");

		// Duration 
		LocalTime localTime5 = LocalTime.of(17, 41);
		LocalTime localTime6 = LocalTime.of(21, 14);
        
		
		Duration between = Duration.between(localTime5, localTime6);
		System.out.println(between.toHours());
		System.out.println(between.toDays());
         System.out.println( Duration.between(localTime5, localTime6).toHours());
		// Instant Represent the time in a machine readable format 

		Instant instant = Instant.now();
		System.out.println(" instant " + instant);
		// Jan 1st 1970 -> Epoch -> Every Day 86400
		System.out.println(instant.getEpochSecond());
		System.out.println(Instant.ofEpochSecond(0));


		// ZoneDateTime 
        System.out.println("---------------Zoned Date Time--------------- ");
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println(zoneDateTime);
		System.out.println(zoneDateTime.getOffset());
		System.out.println(zoneDateTime.getZone());
		System.out.println(zoneDateTime.getMonthValue());
		//  System.out.println(ZoneId.getAvailableZoneIds());
//		ZoneId.getAvailableZoneIds().stream()
//		.forEach(System.out::println);
		long count = ZoneId.getAvailableZoneIds().stream()
				.count();
		System.out.println(count);

		// In America There is 4 time zone CST/EST/MST/PST 
		System.out.println("Chicago CST : "+ ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST : "+ ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LOS Angeles PST : "+ ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver MST : "+ ZonedDateTime.now(ZoneId.of("America/Denver")));

		System.out.println("ZoneDateTime using clock : "+ ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Denver"));
		System.out.println(now);

		LocalDateTime now1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Denver")));
		System.out.println(now1);
         System.out.println("------------------------Instan--------------------");
		System.out.println(LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()));

		// Convert from Local Date Time and Zone Time
		LocalDateTime localDateTime3 = LocalDateTime.now();
		System.out.println(localDateTime3);


		System.out.println(localDateTime3.atZone(ZoneId.of("America/Chicago")));
         System.out.println("----------Instant  -------------");
		ZonedDateTime atZone = Instant.now().atZone((ZoneId.of("America/Chicago")));
		System.out.println(atZone);

		// IST TimeZone to America 
		ZoneId istZone = ZoneId.of("Asia/Kolkata");
		ZoneId americaZone = ZoneId.of("America/Chicago");
        System.out.println("--------------IST-------------");
		ZonedDateTime istTime = ZonedDateTime.now(istZone);
		ZonedDateTime americaTime1 = ZonedDateTime.now(americaZone);
          System.out.println(istTime);
          System.out.println(americaTime1);
		ZonedDateTime americaTime = istTime.withZoneSameInstant(americaZone);
		System.out.println(americaTime);

		DateTimeFormatter format  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")  ;

		System.out.println("IST Time : "+ istTime.format(format));
		System.out.println("America Time :  " + americaTime.format(format));

		// Convert Date From one Zone id to UTC 
		LocalDateTime localDateTime = LocalDateTime.now();

		ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
		ZonedDateTime now2 = localDateTime.atZone(zoneId);

		ZonedDateTime utcDateTime = now2.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println(utcDateTime);
		
		//System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));

        System.out.println(ZonedDateTime.now(ZoneId.of("UTC"))
        		.withZoneSameInstant(zoneId.of("Asia/Kolkata")));

	} 

}
