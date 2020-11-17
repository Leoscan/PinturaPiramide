import java.util.Scanner;

public class Ex1_PesoIdeal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float altura = 0;
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		
		float peso = 0;
		System.out.print("Informe seu peso: ");
		peso = entrada.nextFloat();
		
		boolean h = true;
		System.out.print("Você é um homem? (True/false): ");
		h = entrada.nextBoolean();
		
		float pIdeal = 0;
	
		if (h == true){
			System.out.println("É um homem usando a fórmula ((altura*72.7) - 58)");
			pIdeal = (float) ((altura*72.7) - 58) ;
		} else {
			System.out.println("É uma mulher usando a fórmula ((altura*62.1) - 44.7)");
			pIdeal = (float) ((altura*62.1) - 44.7) ;
		}
		
		String sexo = "indefinido";
		if (h == true) {sexo = "Masculino";} else {sexo = "Feminino";}
		
	 
		System.out.println("Altura: "+altura+", Peso: "+peso+", sexo: "+sexo);
		System.out.println("O Peso ideal para está altura é: "+pIdeal+" kg");
		
		if (peso >= pIdeal) {
			System.out.println("Esta acima do peso ideal");
		} else if (peso <= pIdeal) {
			System.out.println("Esta abaixo do peso ideal");
		} else System.out.println("Esta no peso ideal");
		
		entrada.close();


	}

}