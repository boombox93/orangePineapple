package orangePineapple;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame
{
	
	public void runGUI() 
	{
		// Create GUI window
		// **Add items to JPanel not JFrame, the JFrame size is being set by JPanel**
		JFrame jf = new JFrame("Hi");
		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(500, 500));
		jf.getContentPane().add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		
		// Items added below
		
		JTextArea ta = new JTextArea(10, 20);
		ta.setBounds(10, 10, 200, 60);
		Dimension d = new Dimension(10, 24);
		jp.add(ta);
		ta.setPreferredSize(d);
		
		//jp.add(new JLabel("Hello, world!"));
		//jp.add(new JButton("Button"));
		
		// Items displayed on JFrame below
		jf.pack();
		jf.setVisible(true);
		
	}
	
}
