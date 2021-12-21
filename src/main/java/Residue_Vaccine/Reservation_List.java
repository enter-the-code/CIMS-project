package Residue_Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class Reservation_List {
	private static ArrayList<Reservation_Vaccine> Reserv_List = new ArrayList<Reservation_Vaccine>() ;
	private static int count;

//	Reservation_Vaccine test = new Reservation_Vaccine(1, 2, 3, 4);

	public Reservation_List() {
	}

	public String show_all_Reserv(){
		int i=1;
		StringBuilder sb = new StringBuilder();
		for(Iterator<Reservation_Vaccine> it = Reserv_List.iterator(); it.hasNext();) {
			Reservation_Vaccine temp = it.next();
			//System.out.println(temp.toString());
			sb.append(i++ + " 이름 : " + temp.getU1().getName() +"\n"+ "ID : " + temp.getU1().getID() + "\n"+"phone_number : " + temp.getU1().getPhone_num()
			+ "\n" + temp.getYear() + "년" + temp.getMonth() + " 월 " + temp.getDay() + " 일 "+ " 시간 : " + temp.getHour() + "\n");
		}

		return sb.toString();
	}



	public static void add_reservation(Reservation_Vaccine obj){
		Reserv_List.add(obj);
		count++;
	}

//	public ArrayList<Reservation> Array;
//
//	public Reservation_List()
//	{
//		this.Array=new ArrayList<Reservation>();
//	}
}
