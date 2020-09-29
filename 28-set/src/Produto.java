import java.util.Scanner;

 class Produto {
	 
private int codigo ;
private String nome ;
private double preco ;
private double porcentagem ;

 public Produto() {}
 
 public Produto(int codigo, String nome, double preco)
 {
	 this.codigo = codigo ;
	 this.nome = nome;
	 this.preco = preco;
	 
 }

public void rebaixarPreco() {
	preco = preco * 0.9 ;   //pois o valor é 10% de desconto
}

public void rebaixarPreco (double porcent) {
	this.porcentagem = porcent;
	preco = preco * ( (100-porcentagem)/100 ) ;
}

public double getPreco() {
	return preco;
}

public void setPreco (double preco) {
	if (preco >= 0) this.preco = preco;  
	else this.preco = preco * -1 ; 
}

}
