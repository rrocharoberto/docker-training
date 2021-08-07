package br.edu.rocha.test;

import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Test app running: now is: " + new Date());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
