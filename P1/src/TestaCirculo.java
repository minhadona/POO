/*
 * Escreva uma classe denominada Circulo que 
 * tenha a entrada do raio de um círculo como um valor real, 
 * e os métodos para cálculo do diâmetro e a área, 
 * usando um valor de ponto flutuante 3.14159 para pi. 
 * 
 * Utilize as seguintes fórmulas (r é o raio):
 * Diâmetro = 2R 
 * Perímetro = 2piR
 * Área = pi.R^2
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
		
		System.out.println("\nO diametro da circunferência é " + circulo.getDiametro()); 
	    System.out.println("\nA area da circunferência é " + circulo.getArea());
	    System.out.println("\nO perímetro da circunferência é " + circulo.getPerimetro());
	}
}
