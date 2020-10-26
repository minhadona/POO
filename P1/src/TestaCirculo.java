/*
 * Escreva uma classe denominada Circulo que 
 * tenha a entrada do raio de um c�rculo como um valor real, 
 * e os m�todos para c�lculo do di�metro e a �rea, 
 * usando um valor de ponto flutuante 3.14159 para pi. 
 * 
 * Utilize as seguintes f�rmulas (r � o raio):
 * Di�metro = 2R 
 * Per�metro = 2piR
 * �rea = pi.R^2
 * 
 * Crie o programa aplicativo TestaCirculo como exemplo do uso da classe Circulo
 */

import java.util.Scanner;

public class TestaCirculo {
	public static void main (String args[]) {
		Circulo circulo = new Circulo();
		Scanner input = new Scanner (System.in);
		double raio;
		
		System.out.println("Digite o raio: ");
		raio = input.nextDouble();
		
		circulo.setRaio(raio);
		
		System.out.println("\nO diametro da circunfer�ncia � " + circulo.getDiametro()); 
	    System.out.println("\nA area da circunfer�ncia � " + circulo.getArea());
	    System.out.println("\nO per�metro da circunfer�ncia � " + circulo.getPerimetro());
	}
}
