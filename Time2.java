// Time2.java
// Victoria Brown 10/21/2015
// Time2 declaration with overloaded constructors.

public class Time2 {
	private int hour;   // 0-23
	private int minute;  // 0-59
	private int second;   // 0-59
	
	// Time2 no-argument constructor:
	// Initializes each instance variable to 0.
	public Time2() {
		this(0, 0, 0);   // Invokes constructor with 3 arguments.
	}
	
	// Time2 constructor:
	// Hour supplied, minute and second defaulted to 0.
	public Time2(int hour) {
		this(hour, 0, 0);   // Invoke constructor with 3 arguments.
	}
	
	// Time2 constructor:
	// Hour and minute supplied, second defaulted to 0.
	public Time2(int hour, int minute) {
		this(hour, minute, 0);   // Invoke constructor with 3 arguments.
	}
	
	// Time 2 constructor:
	// Hour, minute, and second supplied.
	public Time2(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be 0-23");
		
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("Second must be 0-59");
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Time2 constructor:
	// Another Time2 object supplied.
	public Time2(Time2 time) {
		// Invoke constructor with 3 arguments.
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	// Set Methods
	// Set a new time value using universal time;
	// Validate the data.
	public void setTime(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be 0-23");
		
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("Second must be 0-59");
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Validate and set the hour.
	public void setHour(int hour) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be 0-23");
		
		this.hour = hour;
	}
	
	// Validate and set the minute.
	public void SetMinute(int minute) {
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		
		this.minute = minute;
	}
	
	// Validate and set the second.
	public void SetSecond(int second) {
		if(second < 0 || second >= 60)
		throw new IllegalArgumentException("Second must be 0-59");
	
		this.second = second;
	}
	
	// Get Methods:
	// Get hour value.
	public int getHour() {
		return hour;
	}

	// Get minute value.
	public int getMinute() {
		return minute;
	}
	
	// Get second value.
	public int getSecond() {
		return second;
	}
	
	// Convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format(
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// Convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}
