package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Manager extends JFrame{
	JFrame Mframe = new JFrame("관리자");
	public Manager()
	{
		
		Mframe.setLayout(new FlowLayout());
		
		Mframe.setSize(300, 400);
		
		JLabel man = new JLabel();
		man.setText("관리자 Id / Password 입력");
		
		//관리자 정보 입력용 패널
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 100));
		JLabel id = new JLabel();
		id.setText("Id");
		JTextField it = new JTextField( 20);
		JLabel pw = new JLabel();
		pw.setText("비밀번호");
		JTextField pt = new JTextField( 16);		
		p2.add(id);
		p2.add(it);
		p2.add(pw);
		p2.add(pt);
		
		Mframe.add(man);
		Mframe.add(p2);

        Dimension frameSize = Mframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Mframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Mframe.setVisible(true);
	}

}