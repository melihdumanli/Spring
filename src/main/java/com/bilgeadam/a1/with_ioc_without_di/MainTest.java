package com.bilgeadam.a1.with_ioc_without_di;

// To see if Spring Framework does not exist.
// Let's create our own IoC
public class MainTest {
	
	public static void main(String[] args) {
		JavaManager javaManager = new JavaManager(new Java18());
		javaManager.javaVersion();
		
	}
	
}
