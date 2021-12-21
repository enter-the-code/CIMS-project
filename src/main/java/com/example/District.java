package com.example;
import UserInterface.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class District extends JFrame{
        JFrame Dframe = new JFrame("구별 확진자 정보");
    public District(Vector<String> V)
    {
        
        Dframe.setLayout(new FlowLayout());
        
        Dframe.setSize(1000, 400);
        
        //텍스트 에리어
        JTextArea ta;
        ta = new JTextArea( 10, 20);
        for (int i = 0; i < V.size(); i++) {
                ta.append(V.get(i));
                ta.append("\n");
        }
        //ta.append("abcdedfg"+"\n");
        Dframe.add(ta);
        
        JButton f = new JButton("처음으로");
        f.setPreferredSize(new Dimension(250, 50));
        Dframe.add(f);

        Dimension frameSize = Dframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dframe.setVisible(true);
        
      //처음으로 돌아가는 버튼
        f.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new UI();
                Dframe.setVisible(false);
            }
        });
    }

}