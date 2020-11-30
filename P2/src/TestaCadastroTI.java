class TestaCadastroTI {
	
	public static void main(String args[])
    {
		Programador desenvolvedor1 = new Programador("gabriella destro","gabriella.borges@alumni.usp.br",24,"python","ubuntu");
		System.out.println("Programador 1 --> " + desenvolvedor1.exibeDados());
		
		
		Instrutor professor1 = new Instrutor("gabriella borges","gabriella.borges@fatec.sp.gov.br",24,"francês avançado");
		System.out.println("Instrutor 1 --> " + professor1.exibeDados());
    }
}