package it.alfasoft.rossella;

public class Triangolo {
	
	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	
	
	
	
	public void stampaVertici(){
		System.out.println("coordinato dell A:"+ puntoA.getX()+"-"+puntoA.getY());
 		System.out.println("coordinato dell B:"+ puntoB.getX()+"-"+puntoB.getY());
		System.out.println("coordinato dell C:"+ puntoC.getX()+"-"+puntoC.getY());
	
	}

	
	
	
	
	public Triangolo() {
		
	}



	public Triangolo(Punto puntoA, Punto puntoB, Punto puntoC) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
	}



	public Punto getPuntoA() {
		return puntoA;
	}



	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}



	public Punto getPuntoB() {
		return puntoB;
	}



	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}



	public Punto getPuntoC() {
		return puntoC;
	}



	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}
	
	

}
