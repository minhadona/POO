class Funcionario {
	private String nome;
	private String mail;
	private int idade;
	
	Funcionario(){
	}
	
	Funcionario(String nome, String mail){
		this.nome = nome;
		this.mail = mail;
	}
	
	Funcionario(String nome, String mail, int idade){
		this.nome = nome;
		this.mail = mail;
		this.idade = idade;
	}
	
	public void setMail(String mail)
    {
        this.mail = mail;
    }
	
	public void setIdade(int idade)
    {
        this.idade = idade;
    }
	
	public String exibeDados() {
        return "NOME: " + nome + " MAIL: " + mail + " IDADE: " + Integer.toString(idade) + " ";
	}
}



