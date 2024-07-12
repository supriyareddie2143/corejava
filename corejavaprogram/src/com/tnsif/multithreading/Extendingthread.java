package com.tnsif.multithreading;

public class Extendingthread extends Thread {//multithreadng demo extending thread
	public void run()//running state
	{
		System.out.println("hello");
	}
	
public static void main(String[] args) {
	Extendingthread e=new Extendingthread();
	e.start();//runnable state
		}
}

