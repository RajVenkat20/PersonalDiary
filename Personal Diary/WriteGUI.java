import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

import javax.swing.*;

public class WriteGUI extends JFrame implements ActionListener
{
	JFrame jf;
	JTextField jtf;
	JLabel date,title,info;
	JTextArea jta;
	JButton jb;
	String str1,str2;
	public static TreeSet<String> ts = new TreeSet<String>();
	
	WriteGUI()
	{
		jf = new JFrame("Writing");
		title = new JLabel("WRITE INTO THE DIARY");
		jta = new JTextArea();
		jtf = new JTextField();
		jb = new JButton("Enter");
		date = new JLabel("Date(DDMMYYY)");
		info = new JLabel();
		
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		
		Font title_font = new Font("Calibri",Font.BOLD,32);
		title.setFont(title_font);
		title.setBounds(700,0,800,50);
		
		Font f1 = new Font("Calibri",Font.BOLD,24);
		jta.setFont(f1);
		jtf.setFont(f1);
		jtf.setBounds(900,70,150,40);
		jta.setBounds(300,150,1200,400);
		jb.setBounds(800,650,100,30);
		date.setBounds(650,70,200,40);
		date.setFont(f1);
		info.setFont(f1);
		info.setBounds(600,720,200,40);
		jb.addActionListener(this);
		
		
		jf.setSize(1900,1000);
		jf.add(title);
		jf.add(date);
		jf.add(jtf);
		jf.add(jta);
		jf.add(jb);
		jf.add(info);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jb)
		{
			str1 = jtf.getText();
			ts.add(str1);
			str2 = jta.getText();
			
			try {
				FileWriter fw = new FileWriter("F:\\Temporary\\" + str1 + ".txt");
				fw.write(str2);
				fw.close();	
			} catch (IOException e) {
				info.setText("Cannot write into the file");
			}
			//new EngineGUI();
		}
	}
	
	/*public static void main(String args[])
	{
		new WriteGUI();
	}*/

	
}
