package pages;

enum Day
{
	SUN("Sunday",1), MON("Monday",2),TUES("Tuesday",3);
	private String dayName;
	private int dayNumber;
	private Day(String dayName, int dayNumber) {
		this.dayName = dayName;
		this.dayNumber = dayNumber;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
	@Override
	public String toString() {
		return this.dayName+"	"+this.dayNumber;
	}
}

public class Enum_giveNamesToOrdinals {
	public static void main(String[] args) {
		Day day = Day.SUN;
		System.out.println("Name		:	"+day.name());
		System.out.println("Ordinal		:	"+day.ordinal());
		System.out.println("Day Name	:	"+day.getDayName());
		System.out.println("Day Number	:	"+day.getDayNumber());
	}
}


