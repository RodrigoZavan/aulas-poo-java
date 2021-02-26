package tabuada;

import java.util.Scanner;


public class Calcula {
	int numero;
	String option;
	
	// Método que passa o número a ser calculado
	
	public void entraNumero() { 
		Scanner input = new Scanner(System.in);
		
		System.out.println("##### - Tabuada - #####");
		System.out.println("***********************");
		
		// Entrada
		
		System.out.print("Insira o número......: ");
		this.numero = input.nextInt();
		
		input.close();
	}
	
	// Método que calcula o número em um laço for
	
	public void calculaTabuadaFor() {
		
			System.out.println("\n\n##### - Tabuada laço For - #####");
			System.out.println("**********************************");
			
			// Processamento / Saída
			
			for (int i=0;i<11;i++) {
				int num1 = i*this.numero;
				System.out.printf("\n %s x %s = %s", this.numero, i, num1);
				
			}

		}
	
	// Método que calcula o número em um laço for
	
	public void calculaTabuadaWhile() {
		
		System.out.println("\n\n##### - Tabuada laço While - #####");
		System.out.println("**********************************");
		
		// Processamento / Saída
		
		int i=0;
		while (i < 11) {
			int num1 = i*this.numero;
			System.out.printf("\n %s x %s = %s", this.numero, i, num1);
			i++;
			
		}
	}

}
	
