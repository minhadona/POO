/*
 * Classe Conta com atributo saldo (n�mero real)
 * Construtor Conta()
 * Construtor Conta(saldo) se quiser inicializar a conta com algum saldo inicial de par�metro
 * M�todo saldo para consultar saldo
 * M�todo saque(valor) para fazer saque do saldo de um valor
 * M�todo deposito(valor) para fazer dep�sito de um valor ao saldo
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		double saldo, valor;
		int opc;
     
      Conta conta = new Conta();
      
      System.out.println("Qual a��o voc� quer tomar agora?\n1) Deposito\n2) Saque\n3) Consultar saldo\n5) Sair");
      opc = input.nextInt();
      
      while (opc!=5){  
      
      switch (opc){    // � por que to declarando essa variavel valor nos dois cases ?  nossa enhora h pq so vou precisar se for fazer deposito ou saque
      case 1: { System.out.println("\nQual � o valor do deposito?"); valor = input.nextDouble(); conta.deposito(valor); break;}
      
      case 2: { System.out.println("\nQual � o valor do saque?"); valor = input.nextDouble(); conta.saque(valor);  break;}
      
      case 3: { saldo = conta.saldo(); System.out.println("\nSeu saldo atual � "+ saldo+ " reais\n");  break;}
      } // cases dentro do opc 
      System.out.println("Qual a��o voc� quer tomar agora?\n1) Deposito\n2) Saque\n3) Consultar saldo\n5) Sair");
      opc = input.nextInt();
      
      } // while opc != 5
      System.out.println("\nPrograma encerrado");
			}  //  main
   } //ex 1

