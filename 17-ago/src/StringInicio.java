import java.util.Scanner;

public class StringInicio {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in) ;
		
		String nome; 
		int idade;
		
		System.out.print("digite nome: ");
		nome = input.nextLine();
		
		System.out.print("digite idade: ");
		idade = input.nextInt(); 
		
		System.out.printf("Dados lidos:\nNome:%s\nIdade:%d\n",nome,idade);

		
	}

}
