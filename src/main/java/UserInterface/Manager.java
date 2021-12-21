package UserInterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager extends JFrame{
	JFrame Mframe = new JFrame("관리자");
	public Manager()
	{
		
		Mframe.setLayout(new FlowLayout());
		
		Mframe.setSize(300, 400);
		
		JLabel man = new JLabel();
		man.setText("관리자 Id / Password 입력");
		
		//관리자 정보 입력용 패널
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.setPreferredSize(new Dimension(250, 200));
		JLabel id = new JLabel();
		id.setText("Id");
		final JTextField it = new JTextField( 20);
		JLabel pw = new JLabel();
		pw.setText("비밀번호");
		final JTextField pt = new JTextField( 16);
		JButton f = new JButton("처음으로");
		f.setPreferredSize(new Dimension(250, 30));


		JButton loginBtn = new JButton("로그인");


		p2.add(id);
		p2.add(it);
		p2.add(pw);
		p2.add(pt);
		p2.add(loginBtn);
		p2.add(f);

		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//아이디 비번 확인 테스트 코드~
				String id = it.getText().trim();
				String pw = pt.getText().trim();
				if(id.length()==0 || pw.length()==0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디나 비번을 입력!", JOptionPane.DEFAULT_OPTION);
					return;
				}
				if(id.equals("admin_id") && pw.equals("admin_pw")) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					new show_all_appointment();
					Mframe.setVisible(false);
					return;
				}
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
			}
		});

		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new UI();
				Mframe.setVisible(false);
			}
		});


		Mframe.add(man);
		Mframe.add(p2);

        Dimension frameSize = Mframe.getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Mframe.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        Mframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Mframe.setVisible(true);
	}

}