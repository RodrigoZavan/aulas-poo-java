package tabuada;

import java.util.Scanner;


public class Calcula {
	int numero;
	String option;
	
	// M�todo que passa o n�mero a ser calculado
	
	public void entraNumero() { 
		Scanner input = new Scanner(System.in);
		
		System.out.println("##### - Tabuada - #####");
		System.out.println("***********************");
		
		// Entrada
		
		System.out.print("Insira o n�mero......: ");
		this.numero = input.nextInt();
		
		input.close();
	}
	
	// M�todo que calcula o n�mero em um la�o for
	
	public void calculaTabuadaFor() {
		
			System.out.println("\n\n##### - Tabuada la�o For - #####");
			System.out.println("**********************************");
			
			// Processamento / Sa�da
			
			for (int i=0;i<11;i++) {
				int num1 = i*this.numero;
				System.out.printf("\n %s x %s = %s", this.numero, i, num1);
				
			}

		}
	
	// M�todo que calcula o n�mero em um la�o for
	
	public void calculaTabuadaWhile() {
		
		System.out.println("\n\n##### - Tabuada la�o While - #####");
		System.out.println("**********************************");
		
		// Processamento / Sa�da
		
		int i=0;
		while (i < 11) {
			int num1 = i*this.numero;
			System.out.printf("\n %s x %s = %s", this.numero, i, num1);
			i++;
			
		}
	}

}
	
