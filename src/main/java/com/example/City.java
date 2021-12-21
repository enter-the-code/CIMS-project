package com.example;
import javax.swing.*;

import Infection_Info.guang;
import UserInterface.UI;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;

public class City extends JFrame{
	JFrame ciframe = new JFrame("시별 확진자 정보");
	public City(manegement_system man1)
	{
		final LinkedHashMap<String, guang> si_info=man1.small_info;
		
		ciframe.setLayout(new FlowLayout());
		
		ciframe.setSize(300, 400);
		
		//서울, 부산, 대구, 인천, 광주, 대전, 울산
		JButton a1 = new JButton("서울");
		JButton b1 = new JButton("부산");
		JButton c1 = new JButton("대구");
		JButton d1 = new JButton("인천");
		JButton e1 = new JButton("광주");
		JButton f1 = new JButton("대전");
		JButton g1 = new JButton("울산");
		a1.setPreferredSize(new Dimension(130, 60));
		b1.setPreferredSize(new Dimension(130, 60));
		c1.setPreferredSize(new Dimension(130, 60));
		d1.setPreferredSize(new Dimension(130, 60));
		e1.setPreferredSize(new Dimension(130, 60));
		f1.setPreferredSize(new Dimension(130, 60));
		g1.setPreferredSize(new Dimension(130, 60));
		ciframe.add(a1);
		ciframe.add(b1);
		ciframe.add(c1);
		ciframe.add(d1);
		ciframe.add(e1);
		ciframe.add(f1);
		ciframe.add(g1);
		
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(250, 50));
		ciframe.add(f);
		
		
        Dimension frameSize = ciframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        ciframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ciframe.setVisible(true);
        
        a1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Seoul(si_info.get("서울"));
				ciframe.setVisible(false);
			}
		});
        b1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new Busan(si_info.get("부산"));
        		ciframe.setVisible(false);
        	}
        });
        c1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Daegu(si_info.get("대구"));
				ciframe.setVisible(false);
			}
		});
        d1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new Incheon(si_info.get("인천"));
        		ciframe.setVisible(false);
        	}
        });
        e1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Gwangju(si_info.get("광주"));
				ciframe.setVisible(false);
			}
		});
        f1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new Daejeon(si_info.get("대전"));
        		ciframe.setVisible(false);
        	}
        });
        g1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new Ulsan(si_info.get("울산"));
        		ciframe.setVisible(false);
        	}
        });
        
        
        //처음으로 돌아가는 버튼
        f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				ciframe.setVisible(false);
			}
		});
	}
	

}
