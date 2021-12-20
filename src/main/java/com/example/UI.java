package com.example;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class UI extends JFrame{

    JFrame frame = new JFrame("CIMS");
    public UI()
    {
        
        frame.setLayout(new FlowLayout());
        
        JButton a1 = new JButton("조회");
        JButton b1 = new JButton("예약");
        JButton c1 = new JButton("관리자");
        a1.setPreferredSize(new Dimension(130, 80));
        b1.setPreferredSize(new Dimension(130, 80));
        c1.setPreferredSize(new Dimension(200, 60));
        frame.add(a1);
        frame.add(b1);
        frame.add(c1);
        
        frame.setSize(300, 400);
        Dimension frameSize = frame.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame. setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    
            
        frame.setVisible(true);
    
        a1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new Check();
                        frame.setVisible(false);
                    }
                });
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Reservation();
                frame.setVisible(false);
            }
        });
        c1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Manager();
                frame.setVisible(false);
            }
        });
        

    }
}