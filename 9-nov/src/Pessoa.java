import java.util.Scanner;
import javax.swing.JOptionPane; 

/*						+--------+
 *    CLASSE ATUAL:     | PESSOA |------- < nome , sobrenome, cpf >
 *                      +--------+
 *                      	|
 *                       extends
 *                      	|
 *                      +=======+
 *                      | ALUNO | ------- < matricula, curso > 
 *                      +=======+
 */

public class Pessoa {

	   private String nome;                              
	   private String sobrenome;                               
	   private String cpf;                   
	   
	   public Pessoa( String n, String s, String ncpf)                                       
	   {                                                                  
	      nome      = n;
	      sobrenome = s;
	      cpf       = ncpf;      
	   }
	   
	   public void setNome( String n )
	   {
	      nome = n;
	   } 
	   
	   public String getNome()
	   {
	   return nome;
	   }
	 
	   public void setSobrenome( String s )
	   {
	      sobrenome = s;
	   }
	   
	   public String getSobrenome()
	   {
	      return sobrenome;
	   }
	   
	   public void setCPF( String n )
	   {
	      cpf = n;
	   }
	   
	   public String getCPF()
	   {
	      return cpf;
	   }
	   
	   public String toString()                                         
	   {                                                                
	      return "Nome da pessoa:" +   getNome() + " " + getSobrenome() +                
	              "\nCPF:" + getCPF();
	   }   
	}

