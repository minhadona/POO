/*
 * Classe Conta com atributo saldo (número real)
 * Construtor Conta()
 * Construtor Conta(saldo) se quiser inicializar a conta com algum saldo inicial de parâmetro
 * Método saldo para consultar saldo
 * Método saque(valor) para fazer saque do saldo de um valor
 * Método deposito(valor) para fazer depósito de um valor ao saldo
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		double saldo, valor;
		int opc;
     
      Conta conta = new Conta();
      
      System.out.println("Qual ação você quer tomar agora?\n1) Deposito\n2) Saque\n3) Consultar saldo\n5) Sair");
      opc = input.nextInt();
      
      while (opc!=5){  
      
      switch (opc){    // é por que to declarando essa variavel valor nos dois cases ?  nossa enhora h pq so vou precisar se for fazer deposito ou saque
      case 1: { System.out.println("\nQual é o valor do deposito?"); valor = input.nextDouble(); conta.deposito(valor); break;}
      
      case 2: { System.out.println("\nQual é o valor do saque?"); valor = input.nextDouble(); conta.saque(valor);  break;}
      
      case 3: { saldo = conta.saldo(); System.out.println("\nSeu saldo atual é "+ saldo+ " reais\n");  break;}
      } // cases dentro do opc 
      System.out.println("Qual ação você quer tomar agora?\n1) Deposito\n2) Saque\n3) Consultar saldo\n5) Sair");
      opc = input.nextInt();
      
      } // while opc != 5
      System.out.println("\nPrograma encerrado");
			}  //  main
   } //ex 1

