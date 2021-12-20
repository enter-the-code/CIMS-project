package Residue_Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class Reservation_List {
	private static ArrayList<Reservation> Reserv_List = new ArrayList<Reservation>() ;

	private Reservation_List() {
	}

	public void show_all_Reserv(){
		for(Iterator<Reservation> it = Reserv_List.iterator() ; it.hasNext();) {
			Reservation temp = it.next();
			System.out.println(temp.toString());
		}
	}

	public static void add_reservation(Reservation obj){
		Reserv_List.add(obj);
	}

//	public ArrayList<Reservation> Array;
//
//	public Reservation_List()
//	{
//		this.Array=new ArrayList<Reservation>();
//	}
}
