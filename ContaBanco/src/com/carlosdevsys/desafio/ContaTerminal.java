package com.carlosdevsys.desafio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadstrtando novo cliente.");
		System.out.println("Por favor, digite o numero da agencia: ");
		agencia = sc.next();
		System.out.println("Por favor, digite o numero da conta: ");
		numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digiite o saldo inicial da conta: ");
		saldo = sc.nextDouble();
		System.out.printf("\"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\"", nomeCliente, agencia, numeroConta, saldo );
		
	}

}
