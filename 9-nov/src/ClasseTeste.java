import java.util.Scanner;
import javax.swing.JOptionPane; 

// Classe de teste que instancia objeto da classe aluno 
public class ClasseTeste {
	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno("Gabriella", "Destro", "34555831802", 20111099, "Análise e desenvolvimento de Sistemas");
		
	    System.out.println("\nDADOS DO ALUNO via aluno.toString \n"+ aluno.toString()	);
	    System.out.println("Dados gerais do Pessoa, CPF exemplo, via aluno.getCPF(metodo da classe pessoa): "+ aluno.getCPF());
	}
}
