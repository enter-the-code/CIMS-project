package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class District extends JFrame{
    
    public District()
    {
        JFrame Dframe = new JFrame("구별 확진자 정보");
        Dframe.setLayout(new FlowLayout());
        
        Dframe.setSize(300, 400);
        

        Dimension frameSize = Dframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dframe.setVisible(true);
    }

}
