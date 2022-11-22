package com.Thread.demo;


public class Thread3 extends Thread{

	Test obj;
	
	Thread3(Test obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method4();
		}
}