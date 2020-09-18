package test2;

public class Birthday {
	private Integer day;
	private Integer month;
	private Integer year;
	
	
	public Birthday(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Birthday() {
	}
	
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Birthday [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
