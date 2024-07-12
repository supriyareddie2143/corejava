package com.tnsif.synchronizationdemo;
//synchronization demo
public class Example {
	synchronized static void display() {//used to call in run method
		Thread d=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try
			{
				Thread.sleep(1000);
				System.out.println(d.getName()+"  "+i);
			}
			catch(Exception e) {
				System.out.println();
				
			}
		}
		
	}

}
