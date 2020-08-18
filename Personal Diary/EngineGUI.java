import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EngineGUI extends JFrame implements ActionListener {
	
	JFrame jf;
	JComboBox jcb;
	JLabel title,info;
	String str[]= {"    Write","    Read","    Delete","    Password Change","    Logs","    Exit"};
	
	public EngineGUI()
	{
		jf = new JFrame("The Choosing Window");
		title = new JLabel("CHOOSE FROM THE LIST OF OPTIONS");
		jcb = new JComboBox(str);
		info = new JLabel();
		
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		Font font = new Font("Calibri", Font.BOLD,32);
		title.setFont(font);
		title.setBounds(500,0,800,50);
		
		Font f1 = new Font("Calibri",Font.BOLD,24);
		jcb.setFont(f1);
		jcb.setBounds(500,200,500,100);
		jcb.addActionListener(this);
		info.setFont(f1);
		info.setBounds(400,600,200,100);
		
		jf.setSize(1900,1000);
		jf.add(title);
		jf.add(jcb);
		jf.add(info);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource()==jcb)
		{
			try
			{
				if(jcb.getSelectedIndex()==0)
				{
					new WriteGUI();
				}
				
				if(jcb.getSelectedIndex()==1)
				{
					new ReadGUI();
				}
				
				if(jcb.getSelectedIndex()==2)
				{
					System.out.println("Hi");
					new DeleteGUI();
				}
				
				if(jcb.getSelectedIndex()==3)
				{
					Thread pc = new Thread(new PasswordChangeGUI());
					pc.start();
					pc.join();
				}
				
				if(jcb.getSelectedIndex()==4)
				{
					new EntryLogsGUI();
				}
				
				if(jcb.getSelectedIndex()==5)
				{
					info.setText("You chose to close the diary");
					jcb.removeActionListener(this);
					
				}
			}
			catch(Exception ae)
			{
				info.setText("Error");
			}
		}
		
	}
	
	/*public static void main(String args[])
	{
		new EngineGUI();
	}*/

	

}
