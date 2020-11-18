package JAVA1;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salario = 0;
		int porcentagem = 0;
		float aumento = 0;
		float aumentoSal = 0;
		
		System.out.print("Digite o seu sálario: ");
		salario = entrada.nextFloat();		
		
		if (salario <= 280 && salario > 0) {
			aumento = (salario/100)*20;
			aumentoSal = salario+aumento;
			porcentagem = 20;
		} else if (salario > 280 && salario <= 700) {
			aumento = (salario/100)*15;
			aumentoSal = salario+aumento;
			porcentagem = 15;
		} else if (salario > 700 && salario <= 1500) {
			aumento = (salario/100)*10;
			aumentoSal = salario+aumento;
			porcentagem = 10;
		} else if (salario > 1500) {
			aumento = (salario/100)*5;
			aumentoSal = salario+aumento;
			porcentagem = 5;
		}
		
		System.out.println("Seu salário de "+salario+" com um aumento de "+porcentagem+"%, ou de "+aumento+" reais");
		System.out.println("O novo valor do seu salário é de: "+aumentoSal);

		entrada.close();

	}

}