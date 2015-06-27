package orangePineapple;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main implements Runnable{

	private static int _health = 30;
	/*
	@Override
	public void run() 
	{
		// Create GUI window
		// **Add items to JPanel not JFrame, the JFrame size is being set by JPanel**
		JFrame jf = new JFrame("Hi");
		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(800, 800));
		jf.getContentPane().add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		
		// Items added below
		
		JTextArea ta = new JTextArea(10, 20);
		Dimension d = new Dimension(10, 24);
		jp.add(ta);
		ta.setPreferredSize(d);
		
		//jp.add(new JLabel("Hello, world!"));
		//jp.add(new JButton("Button"));
		
		// Items displayed on JFrame below
		jf.pack();
		jf.setVisible(true);
		
	}
	*/
	
	public static int damageMethod(int h)
	{
		
		h -= 1;
		_health=h;
		return h;
	}
	
	@Override
	public void run() 
	{
		
		
		
	}
	
	public static void main(String[] args) 
	{
		/*
		Main m = new Main();
		// Event queue
		SwingUtilities.invokeLater(m);
		*/
		int health = 30;
		
		while(_health > 0)
		{
			
			System.out.println(damageMethod(_health));
			if(_health == 0)
			{
				System.out.println("You ded");
			}
		}
		
		
		
	}

	

	

}
