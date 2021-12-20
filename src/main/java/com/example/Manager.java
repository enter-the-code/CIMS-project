package com.example;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Manager extends JFrame{
    
    public Manager()
    {
        JFrame Mframe = new JFrame("관리자");
        Mframe.setLayout(new FlowLayout());
        
        Mframe.setSize(300, 400);
        

        Dimension frameSize = Mframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Mframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Mframe.setVisible(true);
    }

}
