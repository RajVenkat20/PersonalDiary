import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class DeleteGUI extends JFrame implements ActionListener{
	
	JFrame jf;
	JLabel date,confirm,title,info;
	JButton jb;
	JTextField jtf;
	String str;
	
	DeleteGUI()
	{
		jf = new JFrame("Deleting");
		title = new JLabel("DELETING A PAGE FROM THE DIARY");
		date = new JLabel("Date(DDMMYYY)");
		confirm = new JLabel();
		jtf = new JTextField();
		jb = new JButton("Enter");
		info = new JLabel();
		
		setBackground(Color.GREEN);
		setForeground(Color.RED);
		
		Font title_font = new Font("Calibri",Font.BOLD,32);
		title.setFont(title_font);
		title.setBounds(700,0,800,50);
		
		Font f1 = new Font("Calibri",Font.BOLD,24);
		jtf.setFont(f1);
		jtf.setBounds(900,70,150,40);
		date.setBounds(650,70,200,40);
		date.setFont(f1);
		jb.setBounds(800,550,100,30);
		info.setFont(f1);
		info.setBounds(600,320,500,40);
		jb.addActionListener(this);
		
		jf.setSize(1900,1000);
		jf.add(title);
		jf.add(date);
		jf.add(jtf);
		jf.add(jb);
		jf.add(info);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jb)
		{
			str = jtf.getText();
			WriteGUI.ts.remove(str);
			
			File f = new File("F:\\Temporary\\" + str + ".txt");
			
			if(f.delete())
			{
				info.setText("The page has been removed successfully");
			}
			else
			{
				info.setText("Check the file name and try again");
			}
			//new EngineGUI();
		}
	}
	
	/*public static void main(String args[])
	{
		new DeleteGUI();
	}*/

}
