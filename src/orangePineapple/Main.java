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
		/*
		Main m = new Main();
		// Event queue
		SwingUtilities.invokeLater(m);
		
		p1.setDamage(4);
		p1.setArmor(10);
		p1.setHealth(20);
		System.out.println("Damage: " + p1.getDamage());
		System.out.println("Health: " + p1.getHealth());
		System.out.println("Armor: " + p1.getArmor());
		p1.takeDamage(6);
		System.out.println("Health: " + p1.getHealth());
		System.out.println("Armor: " + p1.getArmor());
		p1.takeDamage(8);
		System.out.println("Health: " + p1.getHealth());
		System.out.println("Armor: " + p1.getArmor());
		
		GUI gui = new GUI();
		Player p1 = new Player();
		gui.runGUI();
			*/
		
		int px = 0;
		int py = 0;
		
		
		
		Player p1 = new Player();
		char grid[][] = new char[10][10];
		Scanner move = new Scanner(System.in);
		System.out.print("Enter your move (U/D/L/R)>");
		System.out.print("Type Stop to quit.");
		while(move.hasNext() == true)
		{
			
			p1.move(move.next());
			
			
		}
		
	}

}
