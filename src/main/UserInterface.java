package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.StyledDocument;



public class UserInterface extends Thread {
Clock clock = new Clock();
public JFrame frame;
public JTextPane console;
public JTextField input;
public JScrollPane scrollpane;
public StyledDocument document;

boolean trace = false;

	public void run() {
		setup();
	/*	Scanner sc = new Scanner(System.in);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		
		System.out.println(": ");
		String input = sc.next(); */
	}
	
	public void setup () {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception ex) {};
		
		frame = new JFrame();
		frame.setTitle("Village Console");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		console = new JTextPane();
		console.setEnabled(false);
		console.setFont(new Font("Courier New", Font.PLAIN,12));
		console.setOpaque(false);
		
		input = new JTextField();
		input.setFont(new Font("Courier New", Font.PLAIN,12));
		input.setCaretColor(Color.WHITE);
		input.setForeground(Color.WHITE);
		input.setOpaque(false);
		
		scrollpane = new JScrollPane(console);
		scrollpane.setBorder(null);
		scrollpane.setOpaque(false);
		scrollpane.getViewport().setOpaque(false);
		
		frame.add(input, BorderLayout.SOUTH);
		frame.add(scrollpane, BorderLayout.CENTER);
		frame.setSize(660, 350);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLocationRelativeTo(null);
		
	
		
	}
}
