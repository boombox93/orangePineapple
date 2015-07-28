package orangePineapple;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main implements Runnable{

	
	
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
	
	
	@Override
	public void run() 
	{
		
		
		
	}
	
	public static void main(String[] args) 
	{
	
		Player p1 = new Player();
		Grid g = new Grid();
		Scanner move = new Scanner(System.in);
		System.out.println("Enter your move (U/D/L/R).");
		g.pRoom(p1.getX(), p1.getY());
		
		while(move.hasNext() == true)
		{
			
			p1.move(move.next());
			g.pRoom(p1.getX(), p1.getY());
			
		}
		
	}

}
