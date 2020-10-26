/* 
 * 01) Elaborar um programa que declare um vetor 
 * de 20 elementos reais. O programa deve requisitar ao usuário 
 * um valor real a ser pesquisado no conjunto. 
 * Caso seja encontrado, deve-se exibir a mensagem de que o mesmo 
 * foi encontrado e em qual posição. Em caso de não existência, 
 * exiba mensagem apropriada.
 * 
 * 02) Elaborar um programa que declare uma matriz 
 * bidimensional que represente uma estante com 4 prateleiras 
 * e 3 compartimentos cada prateleira. Faça um programa que leia 
 * a quantidade de peças em cada compartimento de prateleira. 
 * Exiba os valores das peças por prateleira.
 */
import java.util.Scanner;

public class Exercicio1 {

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int N[] = new int[20];
		for (int i=0; i<N.length ; i++) {
			N[i] = i * 2 ;
		} // atribuindo os valores p vetor como o dobro do valor do índice
		System.out.print("Digite o numero a ser buscado: ");
		double search_value = input.nextDouble(); 
		String encontrado = "";
		for (int i=0;i<N.length ;i++) {
			if (N[i] == search_value) {System.out.print("Número encontrado na "+(i+1)+"a posição"); encontrado = "sim"; break; }
		}
		if (encontrado != "sim") System.out.print("NÚMERO NÃO ENCONTRADO NO VETOR"); 
	}
	
}
