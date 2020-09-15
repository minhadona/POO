/*
 * Criar a classe Circunfer�ncia para calcular o di�metro e �rea da cincunfer�ncia.
 * Classe Circunfer�ncia.
 * E o programa para testar a classe Circunfer�ncia.
 */

class Circunferencia {

	private double Raio;
	
	public Circunferencia() {}
	
	public Circunferencia(double raio) {
		setRaio(raio);	 
      // valores para serem atribu�dos na classe
	}
	
	public void setRaio(double raio) {
		if (raio<0) Raio = raio * -1; 
		else Raio = raio;
      // m�todo que atribui valor pra classe
	}
	
	public double getDiametro() {
		return Raio * 2;
	}  // m�todo da classe que retorna valor do diametro, usando o valor da variavel Raio atribu�da pelo setRaio
	
	public double getArea(){
		return 3.14 * (Math.pow(Raio, 2));
	}  // m�todo da classe que retorna valor da area, usando o valor da variavel Raio atribu�da pelo setRaio
	
}
