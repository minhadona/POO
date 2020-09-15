/*
 * Criar a classe Circunferência para calcular o diâmetro e área da cincunferência.
 * Classe Circunferência.
 * E o programa para testar a classe Circunferência.
 */

class Circunferencia {

	private double Raio;
	
	public Circunferencia() {}
	
	public Circunferencia(double raio) {
		setRaio(raio);	 
      // valores para serem atribuídos na classe
	}
	
	public void setRaio(double raio) {
		if (raio<0) Raio = raio * -1; 
		else Raio = raio;
      // método que atribui valor pra classe
	}
	
	public double getDiametro() {
		return Raio * 2;
	}  // método da classe que retorna valor do diametro, usando o valor da variavel Raio atribuída pelo setRaio
	
	public double getArea(){
		return 3.14 * (Math.pow(Raio, 2));
	}  // método da classe que retorna valor da area, usando o valor da variavel Raio atribuída pelo setRaio
	
}
