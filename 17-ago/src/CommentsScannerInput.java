// Slide 11 - single-line comment

/* 
 * input = vari�vel do tipo Scanner -> objeto
 * variaveis declaradas como int -> vari�veis de tipo primitivo  
 */

import java.util.Scanner; 

public class CommentsScannerInput {
	
	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in) ;
		int num1, num2, soma; 
		double n1, n2, nsoma; //	OU FLOAT 
		
		String frase; 
		
		System.out.print("Digite o primeiro n�mero inteiro: "); 
		num1= input.nextInt();
		
		System.out.print("Digite o segundo n�mero inteiro: ") ;
		num2=input.nextInt(); //	SE FLOAT, input.nextFloat();
		
		soma = num1+ num2; 
		System.out.printf("A soma � %d \n\n",soma);
		
		System.out.print("Digite o primeiro n�mero double: "); 
		n1 = input.nextDouble(); 
		
		System.out.print("Digite o segundo n�mero double: ") ;
		n2 = input.nextDouble(); 
		
		nsoma = n1 + n2;
		System.out.printf("A soma � %6.2f \n\n",nsoma); //6 eh o numero de casas totais, inteiro+virgula+decimais e 2 � o numero de casas decimais
		
		System.out.print("digite nome: ");
		input.nextLine(); 
		
		frase = input.nextLine();
		
		System.out.printf("Vc digitou: %s",frase);

	}

}
