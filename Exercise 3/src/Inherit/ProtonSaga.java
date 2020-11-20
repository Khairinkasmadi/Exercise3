package Inherit;

import java.util.Scanner;

public class ProtonSaga extends Proton {
	
	private String fuel;
	private String color;
	
	ProtonSaga() {
		this.color ="color";
		
	}
	
	public void color() {
		System.out.println("Enter your car color: ");
		Scanner in = new Scanner(System.in);
		String color = in.next();
		System.out.println("This color still available.");
		
	}
	
	public String getFuel() {
		return fuel;
		
	}
	
	public void setFuel(String fuel) {
		this.fuel=fuel;
		
	}
	
	public void run() {
    	System.out.println("\nProton Saga is running safely");
    	System.out.println("_____________________________");
    	
	}


}
