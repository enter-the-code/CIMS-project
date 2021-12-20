package Infection_Info;

import java.io.IOException;

public class Infection_info {

    public String infected;
    public String dead;
    public String complete;

    public Infection_info(String INF, String D, String C) {
        infected = INF;
        dead = D;
        complete = C;
    }

    public void Total_View() {
        System.out.println("확진자->" + infected + "\n" + "사망인원수->" + dead + "\n" + "완치자 수->" + complete);
    }

    @Override
    public String toString() {

        return "확진자->" + infected + "\n" + "사망인원수->" + dead + "\n" + "완치자 수->" + complete;

    }

}
