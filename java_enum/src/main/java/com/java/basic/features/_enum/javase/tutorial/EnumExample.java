package com.java.basic.features._enum.javase.tutorial;

/**
 * Enum Test
 * @url		http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 *
 * @author 	Lian
 * @date	2016年9月5日
 * @since 	1.0
 */
public class EnumExample {

	Day day;

	public EnumExample(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;

			case FRIDAY:
				System.out.println("Fridays are better.");
				break;

			case SATURDAY:
			case SUNDAY:
				System.out.println("Weekends are best.");
				break;

			default:
				System.out.println("Midweek days are so-so.");
				break;
		}
	}

	public static void main(String[] args) {
		EnumExample firstDay = new EnumExample(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumExample thirdDay = new EnumExample(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumExample fifthDay = new EnumExample(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumExample sixthDay = new EnumExample(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumExample seventhDay = new EnumExample(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
