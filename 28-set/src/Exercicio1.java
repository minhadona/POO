/* 
 * Testar a classe Produto apresentado em aula 
 * 
 * E
 * Elaborar um programa simples (sem criar classes) que tenha os métodos sobrecarregados para cálculo da área  de um terreno nos formatos (a) quadrado, (b) retangular . Faça um programa mostrando o uso desses métodos. 
 * Para criar um método não vinculado à classe, delcare o cabeçalho da função como static
 * exemo: public static void nomeMetodo(){ 
 * }
 * 
 */ 
import java.util.Scanner;

class Exercicio1 
{ //aplicação
	
	public static void main (String args[]) {
		
		System.out.println("A area do retângulo 2 x 3 é "+ getArea(2,3)) ;
	    System.out.println("A area do quadrado com lado 6 é "+ getArea(3)) ;
	}
	
	
	public static float getArea(int d1, int d2){
		return d1 * d2; 
	
	}
	
	public static float getArea(int d1){
		return d1 * d1;   
	}
	
	
}
