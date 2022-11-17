package studio8;

import java.util.Objects;

public class Appointment {
	
	Date date;
	Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	public int hashCode() {
		return Objects.hash(date, time);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		Date a = new Date(2022, 11, 17);
		Date b = new Date(2022, 11, 17);
		Time c = new Time(13, 19, true, "Central America");
		Time d = new Time(13, 19, true, "Central America");
		Appointment e = new Appointment(a, c);
		Appointment f = new Appointment(b, d);
		System.out.println(e.equals(f));
		System.out.println(e == f);
		
	}
}
