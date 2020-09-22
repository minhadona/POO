
 class Conta {

		private double Saldo;
		
		public Conta() {}
		
		public Conta(double saldo) {
			Saldo = saldo();	 
	      // valores para serem atribuídos na classe
		}
		
		public double saldo() {
			return Saldo;
		}  // método da classe que retorna valor do diametro, usando o valor da variavel Raio atribuída pelo setRaio
		
	   public void saque(double valor) {
	      
		   if ((Saldo - valor) < 0) System.out.println("VC N PODE SACAR ESSE VALOR POIS N POSSUI SALDO SUFICIENTE !!!!!!!!!!!!!!!!!!!!\n\n"); 
		   else Saldo = Saldo - valor;
	      // 
	   }
		public void deposito(double valor) {
	      Saldo = Saldo + valor;
		}  	
	}
