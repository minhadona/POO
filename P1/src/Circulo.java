
public class Circulo {
private double Raio;
	
	public Circulo() {}
	
	public Circulo(double raio) {
		setRaio(raio);	
	}
	
	public void setRaio(double raio) {
		if (raio<0) Raio = raio * -1; 
		else Raio = raio;
	}
	
	public double getDiametro() { //2*R
		return Raio * 2;
	}
	
	public double getArea(){ //pi.R^2
		return 3.14159 * (Raio * Raio);  
	}
	
	public double getPerimetro(){  //2.pi.R
		return 2 * 3.14159 * Raio ;
	}
}
