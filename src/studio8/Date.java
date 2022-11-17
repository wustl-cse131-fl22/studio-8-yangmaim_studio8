package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	// instance variables
	int year;
	int month;
	int day;
	boolean isHoliday;
	
	/**
	 * Constructs Date objects with year, month, and day parameters
	 * 
	 * @param year the year
	 * @param year the month
	 * @param day the day
	 */
    public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
    
    // toString()
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + ", isHoliday=" + isHoliday + "]";
	}

	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date a = new Date(2022, 11, 17);
		Date b = new Date(2022, 11, 17);
		Date c = new Date(2024, 11, 17);
		Date d = new Date(2025, 11, 17);
		Date e = new Date(2026, 11, 17);
//		LinkedList<Date> list = new LinkedList<Date>();
//		list.add(a);
//		list.add(b);
//		list.add(a);
//		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(a);
		System.out.println(set);
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(a.equals(b));
//		System.out.println(a == b);
	}
}
