package com.example;
import UserInterface.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame{
	JFrame cframe = new JFrame("COVID-19 현황 조회");
	public Check(manegement_system MNG)
	{
		final manegement_system man1=MNG;
		cframe.setLayout(new FlowLayout());
		
		cframe.setSize(300, 400);
		
		//전체 현황 조회 정보용 Panel
		Panel to = new Panel();
		to.setPreferredSize(new Dimension(250, 20));
		JLabel total = new JLabel();
		total.setText("전체 현황 조회");
		
		to.add(total);
		cframe.add(to);
		
		//확진자 panel
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.setPreferredSize(new Dimension(250, 40));
				
		JLabel a = new JLabel();
		a.setText("확진자 현황:      ");
		JLabel a1 = new JLabel();
		a1.setText(MNG.all_info.infected); //여기 몇명
				
		p.add(a);
		p.add(a1);
				
		//사망자 panel
		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout());
		p1.setPreferredSize(new Dimension(250, 40));
						
		JLabel b = new JLabel();
		b.setText("사망자 현황:      ");
		JLabel b1 = new JLabel();
		b1.setText(MNG.all_info.dead); //여기 몇명
						
		p1.add(b);
		p1.add(b1);
						
		//완치자 panel
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 40));
						
		JLabel c = new JLabel();
		c.setText("완치자 현황:      ");
		JLabel c1 = new JLabel();
		c1.setText(MNG.all_info.complete); //여기 몇명
						
		p2.add(c);
		p2.add(c1);
		
		cframe.add(p);
		cframe.add(p1);
		cframe.add(p2);
		
		JButton A1 = new JButton("시별 확진자 현황");
		JButton B1 = new JButton("구별 확진자 현황");
		A1.setPreferredSize(new Dimension(130, 80));
		B1.setPreferredSize(new Dimension(130, 80));
		cframe.add(A1);
		cframe.add(B1);
		
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(130, 50));
		cframe.add(f);
	

        Dimension frameSize = cframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        cframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cframe.setVisible(true);
        
        A1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new City(man1);
				cframe.setVisible(false);
			}
		});
        B1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new District(man1.colorful_degue);
        		cframe.setVisible(false);
        	}
        });
        
        //처음으로 돌아가는 버튼
        f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				cframe.setVisible(false);
			}
		});
	}

}
