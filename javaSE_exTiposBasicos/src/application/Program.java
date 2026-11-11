package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do vendedor: ");
		String nome = sc.nextLine();

		System.out.print("Valor da venda: ");
		double valorVenda = sc.nextDouble();

		double percentual = 0;
		double comissao = 0;

		if (valorVenda > 0 && valorVenda <= 1000.00) {
			percentual = 2;

		} else if (valorVenda > 1000.00 && valorVenda <= 5000.00) {
			percentual = 5;

		} else if (valorVenda > 5000.00 && valorVenda <= 10000.00) {
			percentual = 8;

		} else if (valorVenda > 10000.0) {
			percentual = 10;
			
		} else {
			System.out.println("Valores  inválidos para venda! ");

		}

		if (valorVenda > 0) {

			comissao = valorVenda * (percentual/100.0);
			
			System.out.println("Nome: " + nome 
					+ ", total vendido: R$" + valorVenda 
					+ ", Percentual: " + percentual
					+ ", comissão: " + comissao);

		}
		sc.close();
	}
}
