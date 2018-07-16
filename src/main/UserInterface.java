package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;



public class UserInterface extends Thread {
public Village village;
public JFrame frame;
public JTextPane console;
public JTextField input;
public JScrollPane scrollpane;
public StyledDocument document;

boolean trace = false;

	public UserInterface (Village village) {
		this.village = village;
	}
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
		
		document = console.getStyledDocument();
		
		input = new JTextField();
		input.setFont(new Font("Courier New", Font.PLAIN,12));
		//input.setCaretColor(Color.WHITE);
		//input.setForeground(Color.WHITE);
		input.setOpaque(false);
		
		input.addActionListener(new ActionListener()
		{
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = input.getText();
					if (text.length() > 1) {
						doCommand(text);
						scrollBottom();
						input.selectAll();
					}
				}
		});
		
		input.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		
		scrollpane = new JScrollPane(console);
		scrollpane.setBorder(null);
		scrollpane.setOpaque(false);
		scrollpane.getViewport().setOpaque(false);
		
		frame.add(input, BorderLayout.SOUTH);
		frame.add(scrollpane, BorderLayout.CENTER);
		frame.setSize(660, 350);
	//	frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLocationRelativeTo(null);
		
		
	}
	public void doCommand(String s) {
		final String[] commands = s.split(" ");				
		System.out.println(Arrays.toString(commands));
		try {
			if (commands.length<=1) {
				switch (commands[0]) {
				case "clear": clear();
					break;
				case "help" : help();
					break;
				case "printTime": print(String.valueOf(village.worldClock.getTime()),false);
					break;
				case "trace": toggleTrace();
					break;
				default : print(s, false);
					break;
				}
			}
			else if (commands.length==2) {
				
			}
			
		}
		catch(Exception ex){
			print("Error -> "+ex.getMessage(), true);
		}
	}
	public void scrollTop() {
		console.setCaretPosition(0);
	}
	public void scrollBottom() {
		console.setCaretPosition(console.getDocument().getLength());
	}
	public void print (String s) {
		print(s,false,new Color(255,255,255));
	}
	public void print (String s, boolean trace) {
		print(s,trace,new Color(255,255,255));
	}
	public void print (String s, boolean trace, Color c) {
		Style style = console.addStyle("Style", null);
		StyleConstants.setForeground(style, c);	
		
		if (trace|| this.trace) {
			Throwable t = new Throwable();
			StackTraceElement[] elements = t.getStackTrace();
			String caller = elements[0].getClassName();
			
			s = caller + " -> " + s;
		}
		
		try {
			document.insertString(document.getLength(), s+"\n", style);
			
		}
		catch (Exception ex) {
		}
			
	}
	public void clear() {
		try {
			document.remove(0, document.getLength());
		}
		catch(Exception ex){}
		}
	public void toggleTrace() {
		if (trace) {
			trace = false;
			print("traceing turned off",false);
		}
		else {
			trace = true;
			print("tracing turned on",false);
		}
	}
	public void help() {
		String helpText = "available commands \n"
						+ "_____________________________________________ \n"
						+ "'clear' clears the console history \n"
						+ "'help' brings up this document \n"
						+ "'printTime' prints the current time of the program to console \n";
		print(helpText, false);
	}
}
