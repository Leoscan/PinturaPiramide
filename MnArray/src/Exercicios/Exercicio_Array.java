package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_Array {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner entrada = new Scanner(System.in);

		boolean continuar = true;

		do {
			int n = 0;
			boolean rcbValores = true;

			do {
				System.out.print("Informe a quantidade de números: ");
				n = entrada.nextInt();

				if (n > 0) {
					rcbValores = false;					
				} else {System.out.println("valor invalido");}
			} while (rcbValores);

			// Gera vetor
			int valores[] = new int[n];

			for (int x = 0; x < n; x++) {
				int valor = 5000;
				valores[x] = generator.nextInt(valor);
			}

			// Arruma vetor em forma crescente

			for (int b = 0; b < valores.length; b++) {
				for (int r = 0; r < valores.length; r++) {
					if (valores[b] < valores[r]) {
						int troca = valores[r];
						valores[r] = valores[b];
						valores[b] = troca;
					}

				}
			}

			// cria listas
			List<Integer> pares = new ArrayList<Integer>();
			List<Integer> impares = new ArrayList<Integer>();
			List<Integer> primos = new ArrayList<Integer>();

			int soma = 0, flag, m = 0;

			for (int i = 0; i < valores.length; i++) {
				soma = soma + valores[i];
				if ((valores[i] % 2) == 0) {
					pares.add(valores[i]);
				} else
					impares.add(valores[i]);

				m = valores[i] / 2;
				flag = 0;
				if (valores[i] == 0 || valores[i] == 1) {
				} else {
					for (int o = 2; o <= m; o++) {
						if (valores[i] % o == 0) {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						primos.add(valores[i]);
					}
				}
			}

			// media, mediana, moda, variancia e desvio
			float media = soma / n;

			float mediana;
			if ((n % 2) == 0) {
				mediana = (valores[n / 2] + valores[n / 2 - 1]) / 2;
			} else {
				mediana = (valores[n / 2]);
			}

			int maxValue = 0, maxCount = 0;
			int count;
			double countVariancia = 0;
			for (int b = 0; b < valores.length; b++) {
				count = 0;
				for (int r = 0; r < valores.length; r++) {
					if (valores[b] == valores[r]) {
						++count;
					}
					if (count > maxCount) {
						maxCount = count;
						maxValue = valores[r];
					}

				}				
				countVariancia = countVariancia + ((valores[b] - media) * (valores[b] - media));
			}

			System.out.println("Menor: " + valores[0] + ", Maior: " + valores[n - 1]);
			System.out.println("Lista de Pares: " + pares);
			System.out.println("Lista de Ímpares: " + impares);
			System.out.println("Lista de Primos: " + primos);

			if (maxCount == 1) {

				System.out.println("Soma: " + soma + ", Média: " + media + ", Mediana: " + mediana + ", Moda: Amodal");

			} else {

				System.out.println(
						"Soma: " + soma + ", Média: " + media + ", Mediana: " + mediana + ", Moda: " + maxValue);

			}

			System.out.println("Variancia: " + countVariancia / (n - 1));

			System.out.println("Desvio Padrão: " + Math.sqrt(countVariancia / (n - 1)));

			System.out.println("Valores gerados: ");
			
			for (int x = 0; x < n; x++) {
				System.out.print(valores[x] + " ");
			}
			
			boolean valorValido = true;
			System.out.println("\n");
			do {
				System.out.print("Deseja continuar (1-sim; 2-não): ");
				int continua = entrada.nextInt();

				if (continua == 2) {
					continuar = false;
					valorValido = false;
					System.out.println("Parando o sistema");
				} else if (continua == 1){
					valorValido = false;
					System.out.println("Continuando");
				} else {System.out.println("valor invalido");}
			} while (valorValido);
			
		} while (continuar);
		entrada.close();
		System.out.println("Sistema Finalizado");
	}

}
