package com.example;
import javax.swing.*;
import javax.swing.event.*;

import Infection_Info.guang;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Busan extends JFrame{
	JFrame Dframe = new JFrame("부산시 확진자/사망자/완치자 현황");
	public Busan(guang target)
	{
		
		Dframe.setLayout(new FlowLayout());
		
		Dframe.setSize(300, 400);
		
		//확진자 panel
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.setPreferredSize(new Dimension(250, 100));
		
		JLabel a = new JLabel();
		a.setText("확진자 현황:      ");
		JLabel a1 = new JLabel();
		a1.setText(target.infected+"명"); //여기 몇명
		
		p.add(a);
		p.add(a1);
		
		//사망자 panel
		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout());
		p1.setPreferredSize(new Dimension(250, 100));
				
		JLabel b = new JLabel();
		b.setText("사망자 현황:      ");
		JLabel b1 = new JLabel();
		b1.setText(target.dead+"명"); //여기 몇명
				
		p1.add(b);
		p1.add(b1);
				
		//완치자 panel
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 100));
				
		JLabel c = new JLabel();
		c.setText("완치자 현황:      ");
		JLabel c1 = new JLabel();
		c1.setText(target.complete+"명"); //여기 몇명
				
		p2.add(c);
		p2.add(c1);
		
		Dframe.add(p);
		Dframe.add(p1);
		Dframe.add(p2);
		
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(250, 30));
		Dframe.add(f);
		

        Dimension frameSize = Dframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dframe.setVisible(true);
        
        //처음으로 돌아가는 버튼
        f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				Dframe.setVisible(false);
			}
		});
	}

}