import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EnterPasswordGUI extends JFrame implements ActionListener
{
	JFrame jf;
	JTextField jtf,jtf1;
	JLabel jl,jl1,name,password;
	JPasswordField jpf;
	JButton jb;
	String txt;
	static String def_pass="UnlockDiary";
	int i;
	
	EnterPasswordGUI()
	{
		//jf.setBackground(Color.WHITE);
		jf = new JFrame("Project");
		jtf = new JTextField(50);
		jl = new JLabel("WELCOME TO PERSONAL DIARY MANAGEMENT");
		jpf = new JPasswordField();
		jb = new JButton("Enter");
		jtf1 = new JTextField();
		jl1 = new JLabel();
		
		jl.setForeground(Color.BLACK);
		jl.setBackground(Color.WHITE);
		Font font = new Font("Calibri", Font.BOLD,32);
		jl.setFont(font);
		jl.setBounds(500,0, 800,50);
		
		
		name = new JLabel("Name");
		Font f1 = new Font("Calibri", Font.BOLD,24);
		name.setFont(f1);
		name.setBounds(500,100, 100,30); 
		jtf.setBounds(750,100,150,30);
		
		password = new JLabel("Password");
		Font f2 = new Font("Calibri", Font.BOLD,24);
		password.setFont(f2);
		password.setBounds(500,150, 100,30);
		jpf.setBounds(750,150,150,30);
		jb.setBounds(800,200,100,30);
		jtf1.setBounds(700,300,250,30);
		jl1.setBounds(650,350,350,30);
		jl1.setFont(f2);
		
		jb.addActionListener(this);
		
		jf.setSize(1900,1000);
		jf.add(jl);
		jf.add(name);
		jf.add(jtf);
		jf.add(password);
		jf.add(jpf);
		jf.add(jb);
		jf.add(jtf1);
		jf.add(jl1);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb)
			{
				txt = jpf.getText();
				if(txt.equals(def_pass))
				{
					EngineGUI eng = new EngineGUI();
				}
				else
				{
					jtf1.setText("Wrong Password is entered");
					jl1.setText("Entering into lockdown mode....");
					jb.removeActionListener(this);
				}
			}
	}
	
	public static void main(String args[])
	{
		new EnterPasswordGUI();
	}
	
}
