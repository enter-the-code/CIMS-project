package com.example;

import java.io.IOException;
import java.security.Key;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import Infection_Info.Infection_info;
import Infection_Info.guang;
public class manegement_system {
    String id;
    int passwd;
    Infection_info all_info;
    LinkedHashMap<String, guang> small_info = new LinkedHashMap<String, guang>();
    Vector<String> colorful_degue=new Vector<String>();

    public manegement_system(String i, int p) {
        id = i;
        passwd = p;
    }

    public void Manage_info() throws IOException, InterruptedException {

        all_info = take_all_info();
        take_small_info();
        take_si_do_info();

    }

    public Infection_info take_all_info() throws IOException, InterruptedException {
        String URL = "https://kosis.kr/covid/covid_index.do";
        Document doc = Jsoup.connect(URL).get();
        String want = "div[class=\"DashboardBox\"]";
        Elements elem = doc.select(want);
        int i = 1;
        String hack = "";
        String sa = "";
        String quck = "";
        for (org.jsoup.nodes.Element e : elem.select("strong")) {
            if (i == 2) {
                hack = e.text();
            }
            if (i == 4) {
                quck = e.text();
            }
            if (i == 6) {
                sa = e.text();
            }
            i++;
        }
        Infection_info all_info = new Infection_info(hack, sa, quck);
        return all_info;

    }

    public void take_small_info() throws IOException, InterruptedException {
        Document doc = Jsoup.connect(
                "http://ncov.mohw.go.kr/bdBoardList_Real.do?brdId=1&brdGubun=13&ncvContSeq=&contSeq=&board_id=&gubun=")
                .get();
        String want = "table[class=\"num midsize\"]";
        Elements name = doc.select(want);
        Elements sex = name.select("tr");
        int i = 0;
        for (Element e : sex) {
            if (i == 0 || i == 1) {
                i++;
            } else {
                Elements tdcon = e.select("td");
                String nm = e.select("th").text();
                // if (nm.equals("합계"))
                    // continue;
                guang g = new guang(tdcon.get(3).text(), tdcon.get(5).text(), tdcon.get(4).text());
                small_info.put(nm, g);

            }
        }

    }

    public void take_si_do_info() throws IOException, InterruptedException{
        Document doc = Jsoup.connect("http://covid19.daegu.go.kr/00936590View1.html").get();
        String want = "div[class=\"form_group\"]";
        Elements main_string=doc.select(want);
        Elements one_string=main_string.select("tbody");
        Elements real_string=one_string.select("li");
        for (Element e : real_string) {
            
            //Elements one_table=e.select("span");
            
                // if (nm.equals("합계"))
                    // continue;
            //String line_one=e.text();
            colorful_degue.add(e.text());

            
        }

    }

    public void show_all() {
        all_info.Total_View();

    }

    public void show_want_thing(String name) {
        guang g;
        g = small_info.get(name);
        g.Total_View();

    }

    public void show_all_gang() {
        for (String Key : small_info.keySet()) {
            System.out.println(Key);
            small_info.get(Key).Total_View();
            System.out.println("-----------------------------");
        }
    }

    public void show_daegu(){
        /*for(String s:colorful_degue){

            System.out.println(s);

        }*/
        for (int i = 0; i < colorful_degue.size()-4; i++) {
            System.out.println(colorful_degue.get(i));
        }
    }
}