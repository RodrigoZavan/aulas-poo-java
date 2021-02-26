package switchcase;

import java.util.Scanner;

public class Notas {
	String codigo, nome; 
	float nota1, nota2, nota3, nota4;
	
	// Método para entrada de dados
	
	public void entraNota() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("###### - Insira seus dados - ######");
		System.out.println("***********************************");
		
		System.out.print("Codigo.............: ");
		this.codigo = input.next();
		
		System.out.print("Nome...............: ");
		this.nome = input.next();
		
		System.out.print("Nota 1.............: ");
		this.nota1 = input.nextFloat();
		
		System.out.print("Nota 2.............: ");
		this.nota2 = input.nextFloat();
		
		System.out.print("Nota 3.............: ");
		this.nota3 = input.nextFloat();
		
		System.out.print("Nota 4.............: ");
		this.nota4 = input.nextFloat();
		
		System.out.println("***********************************");
		
		input.close();
	}
	
	// Método de processamento (soma as notas, calcula a média e exime no console) utilizando switch case
	
	public void imprimeNota() {
		double media = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
		
		System.out.println("###### - Resultado - ######");
		System.out.println("***********************************");
		
		System.out.println("Codigo...: "+this.codigo);
		System.out.println("Nome.....: "+this.nome);
		
		switch ((int) media) {
		case 0 :
			System.out.println("Média = 0 (Nota Zero Péssimo)");
		break;
		case 1 : 
			System.out.println("Média = 1 (Nota Um Ruim)");
		break;
		case 2 : 
			System.out.println("Média = 2 (Nota Dois Regular)");
		break;
		case 3 : 
			System.out.println("Média = 3 (Nota Três Bom)");
		break;
		case 4 : 
			System.out.println("Média = 4 (Nota Quatro Ótimo)");
		break;
		case 5 : 
			System.out.println("Média = 5 (Nota Cinco Excelente)");
		break;
		default: 
			System.out.println("Erro!");
		}
	}
}
