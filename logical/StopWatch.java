package com.logical;

import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {
	public static int seconds=0;
	
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			seconds++;
			System.out.print( seconds + "s ");
		}
	};
	
	public void start() {
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
	}
}
