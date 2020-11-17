import java.util.Scanner;

public class Ex2_Reajuste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salario = 0;
		System.out.print("Informe o sálario: ");
		salario = entrada.nextFloat();
		
		int porcentagem = 0;
		float aumento = 0;
		float salaum = 0;
		
		if (salario <= 280 && salario > 0) {
			aumento = (salario/100)*20;
			salaum = salario+aumento;
			porcentagem = 20;
		} else if (salario > 280 && salario <= 700) {
			aumento = (salario/100)*15;
			salaum = salario+aumento;
			porcentagem = 15;
		} else if (salario > 700 && salario <= 1500) {
			aumento = (salario/100)*10;
			salaum = salario+aumento;
			porcentagem = 10;
		} else if (salario > 1500) {
			aumento = (salario/100)*5;
			salaum = salario+aumento;
			porcentagem = 5;
		}
		
		System.out.println(salario+" com um reajuste de "+porcentagem+"%, recebe um aumento de "+aumento+" reais");
		System.out.println("Novo salário: "+salaum);

		entrada.close();

	}

}