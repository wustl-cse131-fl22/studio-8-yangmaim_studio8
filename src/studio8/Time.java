package studio8;

import java.util.Objects;

public class Time {
	
	// instance variables
	int hour;
	int minute;
	boolean is24Hour;
	String timeZone;
	
	/**
	 * Constructs Time objects with hour, minute, and is24Hour parameters
	 * 
	 * @param hour the hour
	 * @param minute the minute
	 * @param is24Hour 12- or 24-hour format
	 */
	public Time(int hour, int minute, boolean is24Hour, String timeZone) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.is24Hour = is24Hour;
		this.timeZone = timeZone;
	}
	
	// toString()
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", is24Hour=" + is24Hour + ", timeZone=" + timeZone + "]";
	}

	public int hashCode() {
		return Objects.hash(hour, is24Hour, minute, timeZone);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && is24Hour == other.is24Hour && minute == other.minute
				&& Objects.equals(timeZone, other.timeZone);
	}

	public static void main(String[] args) {
		Time a = new Time(13, 19, true, "Central America");
		Time b = new Time(13, 19, true, "Central America");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(a == b);
    }
}