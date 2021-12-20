package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Check extends JFrame{
    JFrame cframe = new JFrame("COVID-19 현황 조회");
    public Check()
    {
        
        cframe.setLayout(new FlowLayout());
        
        cframe.setSize(300, 400);
        
        //전체 현황 조회 정보용 Panel
        Panel p = new Panel();
        p.setPreferredSize(new Dimension(250, 160));
        JLabel total = new JLabel();
        total.setText("전체 현황 조회");
        p.add(total);
        cframe.add(p);
        
        
        JButton a1 = new JButton("시별 확진자 현황");
        JButton b1 = new JButton("구별 확진자 현황");
        a1.setPreferredSize(new Dimension(130, 80));
        b1.setPreferredSize(new Dimension(130, 80));
        cframe.add(a1);
        cframe.add(b1);
    

        Dimension frameSize = cframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        cframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cframe.setVisible(true);
        
        a1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new City();
                cframe.setVisible(false);
            }
        });
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new District();
                cframe.setVisible(false);
            }
});
    }

}
