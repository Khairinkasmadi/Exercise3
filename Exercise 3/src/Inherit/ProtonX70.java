package Inherit;

import java.util.Scanner;

public class ProtonX70 extends Proton {
	
	private String windows;
	private String color;
	
	ProtonX70() {
		this.color ="color";
		
	}
	
	public void color() {
		System.out.println("\n"+"Enter your car color: ");
		Scanner in = new Scanner(System.in);
		String color = in.next();
		System.out.println("This color still available.");
		
	}
	
	public String getWindow() {
		return windows;
		
	}
	
	public void setWindow(String window) {
		this.windows=windows;
		
	}
	
	public void run() {
    	System.out.println("\nProton X70 is running safely");
    	System.out.println("____________________________");
	}
    	

}
