import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PasswordChangeGUI extends JFrame implements Runnable,ActionListener{
	
	JFrame jf;
	JLabel title,old_pass,new_pass,c_new_pass,info;
	JTextField jtf1;
	JPasswordField jpf1,jpf2;
	JButton jb;
	String str1,str2;
	
	public void run()
	{
		jf= new JFrame("Password Change");
		title = new JLabel("PASSWORD CHANGE");
		old_pass = new JLabel("Old Password");
		new_pass = new JLabel("New Password");
		c_new_pass = new JLabel("Confirm New Password");
		jtf1= new JTextField();
		jpf1= new JPasswordField();
		jpf2= new JPasswordField();
		jb = new JButton("Enter");
		info = new JLabel();
		
		
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		
		Font title_font = new Font("Calibri",Font.BOLD,32);
		title.setFont(title_font);
		title.setBounds(700,0,800,50);
		
		Font f1 = new Font("Calibri", Font.BOLD,24);
		old_pass.setFont(f1);
		old_pass.setBounds(300,100,200,30);
		new_pass.setFont(f1);
		new_pass.setBounds(300,200,200,30);
		c_new_pass.setFont(f1);
		c_new_pass.setBounds(300,300,250,30);
		jtf1.setBounds(700,100,200,30);
		jpf1.setBounds(700,200,200,30);
		jtf1.setFont(f1);
		jpf1.setFont(f1);
		jpf2.setFont(f1);
		jb.setBounds(700,400,100,50);
		jpf2.setBounds(700,300,200,30);
		info.setFont(f1);
		info.setBounds(500,500,500,50);
		
		jb.addActionListener(this);
		
		jf.setSize(1900,1000);
		jf.add(title);
		jf.add(old_pass);jf.add(new_pass);jf.add(c_new_pass);
		jf.add(jtf1);jf.add(jpf1);jf.add(jpf2);
		jf.add(jb);jf.add(info);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jb)
		{
			str1 = jtf1.getText();
			str2 = jpf1.getText();
			if(str1.equals(EnterPasswordGUI.def_pass))
			{
				EnterPasswordGUI.def_pass = str2;
			}
			else
			{
				info.setText("Enter the correct original password");
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			new EnterPasswordGUI();
		}
	}

}
