package com.bilgeadam.a1.with_ioc_without_di;

// Creating IoC
public class JavaManager {
	
	// calling interface
	private IJavaVersion iJavaVersion;
	
	// constructor with parameter
	public JavaManager(IJavaVersion iJavaVersion) {
		this.iJavaVersion = iJavaVersion;
	}
	
	// method
	public void javaVersion() {
		iJavaVersion.version();
	}
	
}
