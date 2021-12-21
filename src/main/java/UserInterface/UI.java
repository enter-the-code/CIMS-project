package UserInterface;
import com.example.Check;
import com.example.manegement_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class UI extends JFrame{

	JFrame frame = new JFrame("CIMS");
	manegement_system man = new manegement_system("i", 1);
	public UI()
	{
		try {
			man.Manage_info();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	
	        
	    frame.setVisible(true);
	
		a1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						new Check(man);
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
	public static void main(String args[])
	{
		UI a = new UI();
	}
}


