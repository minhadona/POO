class Programador extends Funcionario
{
      private String linguagem;
      private String sistOper;
      
      Programador()
      {
         super();      
      }
      
      Programador(String nome, String mail, int idade, String linguagem, String sistOper)
      {
          super(nome, mail,idade); 
          this.linguagem = linguagem;
          this.sistOper = sistOper;
      }
            
      public void setLinguagem(String linguagem)
      {
          this.linguagem = linguagem;
      }
      
      public void setOS(String sistOper)
      {
          this.sistOper = sistOper;
      }
      
      public String toString()
      {
         return super.toString() + "linguagem: " + linguagem + "sistema operacional: " + sistOper;
      }
      
}

