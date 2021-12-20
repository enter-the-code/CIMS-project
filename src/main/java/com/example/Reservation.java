package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Reservation extends JFrame{
	JFrame Rframe = new JFrame("잔여 백신 예약");
	public Reservation()
	{
		
		Rframe.setLayout(new FlowLayout());
		
		Rframe.setSize(300, 400);
		JLabel date = new JLabel();
		date.setText("예약 날짜 입력");
		
		
		//날짜 입력용 패널
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.setPreferredSize(new Dimension(250, 100));
		JLabel year = new JLabel();
		year.setText("연도");
		JTextField yt = new JTextField("2022", 19);
		JLabel month = new JLabel();
		month.setText("월");
		JTextField mt = new JTextField("1", 20);
		JLabel day = new JLabel();
		day.setText("일");
		JTextField dt = new JTextField("11", 20);
		JLabel time = new JLabel();
		time.setText("시");
		JTextField tt = new JTextField("11", 20);
		
		p.add(year);
		p.add(yt);
		p.add(month);
		p.add(mt);
		p.add(day);
		p.add(dt);
		p.add(time);
		p.add(tt);
		
		JLabel user = new JLabel();
		user.setText("사용자 정보 입력");
		
		//사용자 정보 입력용 패널
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 100));
		JLabel name = new JLabel();
		name.setText("이름");
		JTextField nt = new JTextField(19);
		JLabel id = new JLabel();
		id.setText("id");
		JTextField it = new JTextField( 20);
		JLabel pw = new JLabel();
		pw.setText("비밀번호");
		JTextField pt = new JTextField( 16);
		JLabel phone = new JLabel();
		phone.setText("연락처");
		JTextField phnt = new JTextField("01012345678",18);
		
		p2.add(name);
		p2.add(nt);
		p2.add(id);
		p2.add(it);
		p2.add(pw);
		p2.add(pt);
		p2.add(phone);
		p2.add(phnt);
		
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(130, 50));
		
		Rframe.add(date);
		Rframe.add(p);
		Rframe.add(user);
		Rframe.add(p2);
		Rframe.add(f);
		

        Dimension frameSize = Rframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Rframe.setVisible(true);
        
        f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				Rframe.setVisible(false);
			}
		});
	}

}