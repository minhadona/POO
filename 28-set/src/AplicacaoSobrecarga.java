// CLASSE DE APLICAÇÃO PRA CLASSE PRODUTO.JAVA 

class AplicacaoSobrecarga {

	public static void main (String args[]) {
		Produto p1 = new Produto (100, "LAPIS",1); 
		Produto p2 = new Produto (101, "CANETA" ,2); 
		
		System.out.println ("PRECO INICIAL DE P1 :"+ p1.getPreco()) ;
		System.out.println ("PRECO INICIAL DE P2 :"+ p2.getPreco()); 
		
		p1.rebaixarPreco();
		p2.rebaixarPreco(50);
	
		System.out.println(); 
		System.out.println("PREÇO DE P1 REBAIXADO: "+p1.getPreco());
		System.out.println("PREÇO DE P2 REBAIXADO: "+p2.getPreco()); 
		
		System.exit(0); 
		
	}

	
}
