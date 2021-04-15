package org.computer;

public class Desktop1 implements HardWare, SoftWare {
	public void desktopModel() {
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop1 obj = new Desktop1();
		obj.hardwareResources();
		obj.softwareResources();
               
	}
	@Override
	public void hardwareResources() {
		System.out.println("Mother boad");
		
	}
	@Override
	public void softwareResources() {
		System.out.println("Java");
		
	}
	
	
}
