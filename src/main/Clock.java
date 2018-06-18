package main;

public class Clock extends Thread{
	int time;
	
	public synchronized void run() {
		while(true) {
			time++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public int getTime() {
		return time;
	}
	public void printTime() {
		System.out.println("time: "+time);
	}

}
