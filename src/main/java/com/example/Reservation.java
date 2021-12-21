package com.example;

import Participant.user;
import Residue_Vaccine.Reservation_List;
import Residue_Vaccine.Reservation_Vaccine;
import Residue_Vaccine.Residual_vaccine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reservation extends JFrame{
	JFrame Rframe = new JFrame("잔여 백신 예약");
	public Reservation()
	{
		final int number = Residual_vaccine.getQuantity() ;//잔역백신 수량 받아오기
		Rframe.setLayout(new FlowLayout());

		Rframe.setSize(300, 400);
		Panel temp = new Panel();
		temp.setLayout(new FlowLayout());
		temp.setPreferredSize(new Dimension(250, 50));
		JLabel date = new JLabel();
		date.setText("<html>예약날짜 입력<br>잔여백신 수량 : <html>" + number);
		JLabel vaccine_num = new JLabel();
		//vaccine_num.setText();
		temp.add(date);
		temp.add(vaccine_num);
		//날짜 입력용 패널
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.setPreferredSize(new Dimension(250, 100));
		JLabel year = new JLabel();
		year.setText("연도");
		final JTextField yt = new JTextField("2022", 19);
		JLabel month = new JLabel();
		month.setText("월");
		final JTextField mt = new JTextField("1", 20);
		JLabel day = new JLabel();
		day.setText("일");
		final JTextField dt = new JTextField("11", 20);
		JLabel time = new JLabel();
		time.setText("시");
		final JTextField tt = new JTextField("11", 20);

		p.add(year);
		p.add(yt);
		p.add(month);
		p.add(mt);
		p.add(day);
		p.add(dt);
		p.add(time);
		p.add(tt);

		final JLabel user1 = new JLabel();
		user1.setText("사용자 정보 입력");

		//사용자 정보 입력용 패널
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 100));
		JLabel name = new JLabel();
		name.setText("이름");
		final JTextField nt = new JTextField(19);
		JLabel id = new JLabel();
		id.setText("id");
		final JTextField it = new JTextField(20);
		JLabel pw = new JLabel();
		pw.setText("비밀번호");
		final JTextField pt = new JTextField(16);
		JLabel phone = new JLabel();
		phone.setText("연락처");
		final JTextField phnt = new JTextField("01012345678",18);

		p2.add(name);
		p2.add(nt);
		p2.add(id);
		p2.add(it);
		p2.add(pw);
		p2.add(pt);
		p2.add(phone);
		p2.add(phnt);



		JButton reservation = new JButton("예약하기");
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(130, 50));

		Rframe.add(temp);
		Rframe.add(p);
		Rframe.add(user1);
		Rframe.add(p2);
		Rframe.add(reservation);
		Rframe.add(f);


		Dimension frameSize = Rframe.getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rframe.setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		Rframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Rframe.setVisible(true);

		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				Rframe.setVisible(false);
			}
		});
		reservation.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				if(number>0) {
					Reservation_Vaccine temp = new Reservation_Vaccine(yt.getText(),mt.getText(),dt.getText(),tt.getText());
					Residual_vaccine.setQuantity(number-1);
					user temp_user = new user(nt.getText(),it.getText(),pt.getText(),phnt.getText());
					temp.make_user(temp_user);
					Reservation_List.add_reservation(temp);
					JOptionPane.showMessageDialog(null, "예악이 완료되었습니다.");
					new UI();
					Rframe.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "잔여백신이 없습니다..");
					new UI();
					Rframe.setVisible(false);
				}
			}

		});



	}

}