package com.abc.test;

import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void sampletest(){
		for(int i=1; i<10; i++){
			System.out.println("Sample program........"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
