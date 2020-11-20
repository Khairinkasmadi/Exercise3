package Inherit;

import java.util.Scanner;

public class ProtonPersona extends Proton {

	private String bigBoot;  //private data member
	private String radio;
	private String color;
	
	
    ProtonPersona() {
		System.out.println("\nPlease enter boot space for Proton Persona: ");
		Scanner in = new Scanner(System.in);
		String boot = in.next();
		
				
				this.bigBoot=boot;
				this.color="color";
    }
    
    public void boot() {
    	System.out.println("Boot space  : " + bigBoot);
    	
    }
    
    public void color() {
    	System.out.println("Enter your car color: ");
    	Scanner in = new Scanner(System.in);
    	String color = in.next();
    	System.out.println("This color still available.");
    	
    }

    
    //Getter method for radio
    public String getRadio() {
    	return radio;
    }
    
    //Setter method for radio
    public void setRadio(String radio) {
    	this.radio=radio;
    }
    
    public void run() {
    	System.out.println("\nProton Persona is running safely");
    	System.out.println("________________________________");
    }
}
    
    
