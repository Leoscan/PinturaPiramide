package JAVA1;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float altura = 0;
		System.out.print("Informe a sua altura:");
		altura = entrada.nextFloat();

		float peso = 0;
		System.out.print(" Digite o seu peso atual:");
		peso = entrada.nextFloat();

		boolean sexo;
		System.out.print(" Você é mulher?(true or false):");
		sexo = entrada.nextBoolean();

		float peso_idealf = 0;
		float peso_idealm = 0;

		if (sexo == true) {
			peso_idealf = (float) ((altura * 62.1) - 44.7);

			System.out.print(" Você é do sexo feminino, sua altura é de: " + altura + " seu peso atual é:" + peso);

			if (peso_idealf > peso) {
				System.out.print(" Você está acima do seu peso ideal");

			} else if (peso_idealf < peso) {
				System.out.print(" Você está abaixo do seu peso ideal");
			} else
				System.out.print(" Você está no seu peso ideal!");

		} else { 
			peso_idealf = (float) ((altura * 72.7) - 58);
			
			System.out.print(" Você é do sexo masculino, sua altura é de: " + altura + " seu peso atual é:" + peso);
			if (peso_idealm>peso) {
			System.out.print(" Você está acima do seu peso ideal");
		} else if (peso_idealf < peso) {
			System.out.print(" Você está abaixo do seu peso ideal");
		} else 
			System.out.print(" Você está no seu peso ideal!");
		}
	entrada.close();
	}
}






