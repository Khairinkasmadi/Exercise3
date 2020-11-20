package Inherit;

public class MainProton {
	
	public static void main(String[] args) {
		
		
		ProtonSaga s = new ProtonSaga();
		System.out.println("Proton Saga features :- ");
		s.printProton();
		s.setFuel("Efficiency\n");  //ENCAPSULATION Calling setter method
		System.out.println("Fuel comsumption : "+s.getFuel()); // Calling getter method
		s.color();
		System.out.println("Total price");
		s.sum(30000,2800);
		s.run();
		
		ProtonPersona p = new ProtonPersona();
		System.out.println("\nProton Persona features :- ");
		p.boot();
		p.setRadio("Sony\n");
		System.out.println("Radio brand : "+p.getRadio());
		p.color();
		System.out.println("Total price");
		p.sum(60000,7200);
		p.run();
	
		
		ProtonX50 p2 = new ProtonX50();
		System.out.println("\nProton X50 features :- ");
		p2.printProton();
		p2.setPark("Auto parking\n");
		System.out.println("Auto park   : "+p2.getPark());
		p2.color();
		System.out.println("Total price");
		p2.sum(70000,9200);
		p2.run();
		
		ProtonX70 p1 = new ProtonX70();
		System.out.println("\nProton X70 features :- ");
		p1.printProton();
		p1.setWindow("Half tinted");
		System.out.println("Window type : "+p1.getWindow());
		p1.color();
		System.out.println("Total price");
		p1.sum(90000,4800);
		p1.run();
		
	}

}
