class Instrutor extends Funcionario
{
      private String disciplina;
      
      Instrutor()
      {
         super();      
      }
      
      Instrutor(String nome, String mail, int idade, String disciplina)
      {
          super(nome, mail,idade); 
          this.disciplina = disciplina;
      }
            
      public void setDisciplina(String disciplina)
      {
          this.disciplina = disciplina;
      }
      
      public String exibeDados()
      {
         return super.exibeDados() + "disciplina: " + disciplina;
      }
      
}

