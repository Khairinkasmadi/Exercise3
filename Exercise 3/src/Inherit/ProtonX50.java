package Inherit;

import java.util.Scanner;

public class ProtonX50 extends ProtonX70 {
	
	private String park;
	private String color;
	
	ProtonX50() {
		
		this.color = "color";
		
	}
	
	public void color() {
		System.out.println("Enter your car color: ");
		Scanner in = new Scanner(System.in);
		String color = in.next();
		System.out.println("This color still available.");
		
	}
	
	public String getPark() {
		return park;
		
	}
	
	public void setPark(String park) {
		this.park=park;
		
	}
	
	public void run() {
    	System.out.println("\nProton X50 is running safely");
    	System.out.println("____________________________");
    	
	}
	

}
