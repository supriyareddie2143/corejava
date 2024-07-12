package com.tnsif.multithreading;

public class Implementingrunnable implements Runnable {
	public static void main(String[] args) {

	Implementingrunnable r=new Implementingrunnable();
	//new state
	//r.start();//error because no thread object
	Thread d= new Thread();
	d.start();
	}

	public void run() {
		System.out.println("implementing runnable interface");
		// TODO Auto-generated method stub
		
	}
	
	
}

