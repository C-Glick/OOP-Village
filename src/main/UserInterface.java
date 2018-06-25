package main;
import java.util.Scanner;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


public class UserInterface extends Thread {
Clock clock = new Clock();

	public void run() {
		setup();
		Scanner sc = new Scanner(System.in);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		
		System.out.println(": ");
		String input = sc.next();
	}
	
	public void setup () {
	
	}
}
