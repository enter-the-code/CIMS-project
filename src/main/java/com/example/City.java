package com.example;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class City extends JFrame{
    
    public City()
    {
        JFrame ciframe = new JFrame("시별 확진자 정보");
        ciframe.setLayout(new FlowLayout());
        
        ciframe.setSize(300, 400);
        

        Dimension frameSize = ciframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        ciframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ciframe.setVisible(true);
    }

}
