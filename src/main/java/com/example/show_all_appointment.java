package com.example;

import Residue_Vaccine.Reservation_List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class show_all_appointment {
    JFrame Mframe = new JFrame("예약리스트 확인");
    public show_all_appointment()
    {
        Mframe.setLayout(new FlowLayout());
        Mframe.setSize(300, 400);
        Reservation_List list = new Reservation_List();

      //  list.add_reservation( new Reservation_Vaccine(1, 2, 3, 4));

        JTextArea sa;
        sa = new JTextArea( 10, 20);
        sa.append(list.show_all_Reserv());
        Mframe.add(sa);

        JButton f = new JButton("처음으로");
        f.setPreferredSize(new Dimension(250, 50));
        Mframe.add(f);


        Dimension frameSize = Mframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Mframe.setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        Mframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Mframe.setVisible(true);

        f.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new UI();
                Mframe.setVisible(false);
            }
        });

    }
}
