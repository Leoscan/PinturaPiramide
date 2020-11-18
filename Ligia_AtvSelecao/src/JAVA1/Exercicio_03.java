package JAVA1;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int saque = 0;
		System.out.print("Digite o Valor que você quer sacar: ");
		saque = entrada.nextInt();

		if (saque >= 10 && saque <= 600) {
			int nCem = saque / 100;
			int resto = saque % 100;
			int nCinq = (resto % 100) / 50;
			resto = resto % 50;
			int nDez = (resto % 100) / 10;
			resto = resto % 10;
			int nCinc = (resto % 100) / 5;
			resto = resto % 5;
			int nUm = (resto % 100) / 1;

			System.out.println("Para o valor desejado de " + saque + " reais, o caixa eletrônico tem as seguintes notas: ");

			if (nCem != 0)
				System.out.print(nCem + " notas de 100, ");
			if (nCinq != 0)
				System.out.print(nCinq + " nota de 50, ");
			if (nDez != 0)
				System.out.print(nDez + " notas de 10, ");
			if (nCinc != 0)
				System.out.print(nCinc + " nota de 5,  ");
			if (nUm != 0)
				System.out.print(nUm + " notas de 1.");

		} else
			System.out.println("Valor de saque inválido");

		entrada.close();
	}
}
