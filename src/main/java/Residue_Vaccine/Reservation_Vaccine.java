package Residue_Vaccine;

import Participant.user;

public class Reservation {

	private int year;
	private int month;
	private int day;
	private int hour;
	//private Reservation_List list = new Reservation_List();
	private user u1 = new user("test_name", "test_id", "test_pw", "test_phone");

	public Reservation(int year, int month, int day, int hour)
	{
		this.year= year;
		this.month= month;
		this.day=day;
		this.hour=hour;
	}

}
