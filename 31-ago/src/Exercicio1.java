import java.util.Scanner;
/*
 * O perfil de uma pessoa pode ser determinado a partir da sua data de nascimento, 
 * conforme exemplificado a seguir. 
 * Dada uma data de nascimento, informe o perfil correspondente.
 * 
 * 
 * 0 Tímido
 * 1 Sonhador
 * 2 Paquerador
 * 3 Atraente
 * 4 Irresistível
 * 
 */

public class Exercicio1 {
	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in) ;
//initializing birthday date variables 
		int Day, Month, Year, Digit; 
		
		System.out.print ("Digite o dia de nascimento: ");
		Day = input.nextInt();
		
		System.out.print ("Digite o mês de nascimento: ");
		Month = input.nextInt();
		
		System.out.print ("Digite o ano de nascimento: ");
		Year = input.nextInt();
		
		if (Day >= 10) Digit = (Day * 100) + Month + Year ;
		else Digit = (Day * 1000) + Month + Year ;
			
		System.out.printf("Digit: %d\n",Digit);
//initializing splitting digit' variables		
		int FirstPart, SecondPart, Sum;
		
		FirstPart = Digit / 100;
		SecondPart = Digit % 100 ;
		
		Sum = FirstPart + SecondPart ;
		System.out.printf("Sum: %d\n",Sum);

//initializing profile fetching variables
		int Profile;
		String Description = "";
	
		Profile = Sum % 5; 
		System.out.printf("Profile: %d\n",Profile);
		
		switch(Profile) {
		case 0: Description = "Timido"; break;
		case 1: Description = "Sonhador"; break;
		case 2: Description = "Paquerador"; break;
		case 3: Description = "Atraente"; break;
		case 4: Description = "Irresistível "; break;
		}
		System.out.printf("Seu aniversário é em %d/%d/%d, então seu perfil é %s", Day,Month,Year,Description);
	}

}
