package PooBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Piramide p1 = new Piramide();
		System.out.print("Informe a altura da piramide: ");
		p1.setH(entrada.nextFloat());
		
		System.out.print("Informe AB da piramide: ");
		p1.setAb(entrada.nextFloat());

		System.out.print("Informe o tipo de tinta (1 - r$ 127,R$ 127,90; 2 – R$ 258,98; 3 – R$ 344,34): ");
		p1.setTinta(entrada.nextInt());
		
		System.out.println("AB: "+p1.getAb());
		System.out.println("H: "+p1.getH());
		System.out.println("AL: "+p1.al());
		System.out.println("Área triangulo: "+p1.ATriangulo());
		System.out.println("Área base: "+p1.ABase());
		System.out.println("Área Total: "+p1.ATotal());
		System.out.println("Tipo da Tinta: "+p1.getTinta());
		System.out.println("Litros: "+p1.Litros());
		System.out.println("Quantidade de Latas: "+p1.Latas());
		System.out.println("Preço: "+p1.Preco());
		System.out.println("Volume: "+p1.Volume());
		
		
		entrada.close();	
		
	}

}
