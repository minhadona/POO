/*
 * Criar a classe Circunfer�ncia para calcular o di�metro e �rea da cincunfer�ncia.
 * Classe Circunfer�ncia.
 * E o programa para testar a classe Circunfer�ncia.
 */
 
import java.util.Scanner;

class Exercicio1 {
	public static void main (String args[]) {
		Circunferencia circunferencia = new Circunferencia();
		Scanner input = new Scanner (System.in);
		double raio;
		
		System.out.println("Digite o raio: ");
		raio = input.nextDouble();
		
		circunferencia.setRaio(raio);
		
	  System.out.println("\nO diametro da circunferencia eh " + circunferencia.getDiametro()); 
     System.out.println("\nA area da circunferencia eh " + circunferencia.getArea());
	}  
   //Essa vers�o do java est� com problemas no printf por algum motivo, precisei usar o println porque dava erro de input mismatch
}
