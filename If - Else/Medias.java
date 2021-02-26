package ifElse;

import java.util.Scanner;

public class Medias {
	String codigo, nome; 
	float nota1, nota2, nota3, nota4;
	
	// Método para entrada de dados
	
	public void insereNotas() {
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
	
	// Método de processamento (soma as notas, calcula a média e exime no console) utilizando if / else
	
	public void calculaMedia() {
		float media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		
		System.out.println("###### - Resultado - ######");
		System.out.println("***********************************");
		System.out.println("Codigo.......: "+this.codigo);
		System.out.println("Nome.........: "+this.nome);
		System.out.println("Nota 1.......: "+this.nota1);
		System.out.println("Nota 2.......: "+this.nota2);
		System.out.println("Nota 3.......: "+this.nota3);
		System.out.println("Nota 4.......: "+this.nota4);
		System.out.println("Media........: "+media);
		
		if (media >= 7) {
			System.out.println("Parabéns, você foi aprovado");
		} else {
			System.out.println("Infelizmente você foi reprovado");
		}
			
		
		
	}
}
