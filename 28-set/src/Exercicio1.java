/* 
 * Testar a classe Produto apresentado em aula 
 * 
 * E
 * Elaborar um programa simples (sem criar classes) que tenha os m�todos sobrecarregados para c�lculo da �rea  de um terreno nos formatos (a) quadrado, (b) retangular . Fa�a um programa mostrando o uso desses m�todos. 
 * Para criar um m�todo n�o vinculado � classe, delcare o cabe�alho da fun��o como static
 * exemo: public static void nomeMetodo(){ 
 * }
 * 
 */ 
import java.util.Scanner;

class Exercicio1 
{ //aplica��o
	
	public static void main (String args[]) {
		
		System.out.println("A area do ret�ngulo 2 x 3 � "+ getArea(2,3)) ;
	    System.out.println("A area do quadrado com lado 6 � "+ getArea(3)) ;
	}
	
	
	public static float getArea(int d1, int d2){
		return d1 * d2; 
	
	}
	
	public static float getArea(int d1){
		return d1 * d1;   
	}
	
	
}
