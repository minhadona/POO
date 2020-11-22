class TestaCadastroDesenvolvedor {
	/*				____________
	 * 			   |FUNCIONARIO |
	 * 				-----------
	 * 				#nome: String
	 * 				#mail: String
	 * 				#idade: integer
	 * 				-----------
	 * 				<<construtor>> Funcionario(nome, mail)
	 * 				<<construtor>> Funcionario(nome, mail, idade)
	 * 				+setMail (mail: String)
	 * 				+setIdade(idade: integer)
	 * 				+exibeDados()
	 * 
	 * 				___________
	 * 			   |PROGRAMADOR|
	 * 				-----------
	 * 				#linguagem: String
	 * 				#sistOper: String
	 * 				-----------
	 * 				<<construtor>> Programador(nome, mail, linguagem)
	 * 				+setLinguagem(ling: String)
	 * 				+setSO(sistOper: String)
	 * 				+exibeDados()
	 * 				
	 */
	public static void main(String args[])
    {
		Programador desenvolvedor1 = new Programador("gabriella destro","gabriella.borges@alumni.usp.br",24,"python","ubuntu");
		System.out.println("Programador 1 --> " + desenvolvedor1.exibeDados());
    }
}
    


