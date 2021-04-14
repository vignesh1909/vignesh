package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("100CM");
	}
public static void main(String[] args) {
	Desktop obj = new Desktop();
	obj.computermodel();
	obj.desktopSize();
	}

}
