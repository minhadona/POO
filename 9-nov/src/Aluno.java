import java.util.Scanner;
import javax.swing.JOptionPane; 

/*						+--------+
 *                      | PESSOA |------- < nome , sobrenome, cpf >
 *                      +--------+
 *                      	|
 *                       extends
 *                      	|
 *                      +=======+
 *   CLASSE ATUAL:      | ALUNO | ------- < matricula, curso > 
 *                      +=======+
 */
public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	
	 public Aluno (String n, String s, String ncpf, int m, String c)                                       
	   {   
		  super( n, s, ncpf );	      
	      setMatricula(m);
	      setCurso(c);
	   }
	 
	 public void setMatricula(int m) {
		 matricula = m < 1 ? 0 : m ;  //se for menor que um, a matricula ser� zero, senao � a propria matricula
	 }
	 
	 public int getMatricula() {
		 return matricula;
	 }
	
	 public void setCurso(String c) {
		 curso = c.isEmpty() ? "Nenhum curso de matr�cula" : c ;
	 }
	 
	 public String getCurso() {
		 return curso ;
	 }
	 
	 public String toString()                                         
	   {                                                                
	      return "Matr�cula: "+ getMatricula() + "\nCurso: " +getCurso()+ "\n";
	   }   
	
}
