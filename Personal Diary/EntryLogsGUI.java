import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

import javax.swing.*;

public class EntryLogsGUI extends JFrame implements ActionListener{
	
	JFrame jf;
	JLabel title;
	JButton jb;
	JTextArea jta;
	
	EntryLogsGUI()
	{
		jf = new JFrame("Log Files");
		title = new JLabel("ALL THE PAGES IN THE DIARY");
		jb = new JButton("LIST ALL PAGES");
		jta = new JTextArea();
		
		
		Font title_font = new Font("Calibri",Font.BOLD,32);
		title.setFont(title_font);
		title.setBounds(700,0,800,50);
		jb.setBounds(810,80,150,30);
		
		Font f1 = new Font("Calibri",Font.BOLD,24);
		jta.setFont(f1);
		jta.setBounds(300,150,1200,400);
		jta.setBackground(Color.WHITE);
		jta.setForeground(Color.BLACK);
		jb.addActionListener(this);
		
		jf.setSize(1900, 1000);
		jf.add(title);
		jf.add(jb);
		jf.add(jta);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		int z=0;
		String string;
		if(e.getSource()==jb)
		{
			
			for(String s:WriteGUI.ts)
			{
				if(z==0)
				{
					jta.setText(s);
				}
				else
				{
					jta.append("\n");
					jta.append(s);
				}
				z++;
			}
		}
	}
	
	/*public static void main(String args[])
	{
		new EntryLogsGUI();
	}*/

}
