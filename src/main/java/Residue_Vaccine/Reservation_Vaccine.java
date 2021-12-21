package Residue_Vaccine;

import Participant.user;

public class Reservation_Vaccine {

	private String year;
	private String month;
	private String day;
	private String hour;

	private user USER ;
	
	
	public Reservation_Vaccine(String year, String month, String day, String hour)
	{
		this.year= year;
		this.month= month;
		this.day=day;
		this.hour=hour;
	}
	
	public void make_user(user temp)
	{
		this.USER=temp;
	}

	public user getU1() {
		return USER;
	}

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDay() {
		return day;
	}

	public String getHour() {
		return hour;
	}
}
