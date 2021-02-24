package cadastro;

import java.util.Scanner;

public class Cadastro {
    int codigo = 1;
    String cpf = "99999999999" ;
    String rg = "999999999";
    String nome = "Rodrigo Rosa Zavan";
    String endereco = "Rua Tete";
    int numero = 256;
    String complemento = "Casa";
    String bairro = "Pq Teste";
    String cidade = "Teste";
    String estado = "SP";
    String telefone = "1455555555";
    String celular = "149999999999";
    String email = "rodrigo.zavan104@gmail.com";
    float salario = 4500;
    String sexo = "M";
	
	void entraAluno() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Codigo.............: ");
		this.codigo = input.nextInt();
		
		System.out.print("CPF................: ");
		this.cpf = input.next();
		
		System.out.print("RG.................: ");
		this.rg = input.next();
		
		System.out.print("Nome...............: ");
		this.nome = input.next();
		
		System.out.print("Endereço...........: ");
		this.endereco = input.next();
		
		System.out.print("Numero.............: ");
		this.numero = input.nextInt();
		
		System.out.print("Complemento........: ");
		this.complemento = input.next();
		
		System.out.print("Bairro.............: ");
		this.bairro = input.next();
		
		System.out.print("Cidade.............: ");
		this.cidade = input.next();
		
		System.out.print("Estado.............: ");
		this.estado = input.next();
		
		System.out.print("Telefone...........: ");
		this.telefone = input.next();
		
		System.out.print("Celular............: ");
		this.celular = input.next();
		
		System.out.print("Email..............: ");
		this.email = input.next();
		
		System.out.print("Salario............: ");
		this.salario = input.nextFloat();
		
		System.out.print("Sexo................: ");
		this.sexo = input.next();
		System.out.println("");
		
		input.close();
		
	}
	
	void imprimeAluno() {
		
		System.out.println("######## - Aluno Cadastrado - ########");
		System.out.println("Codigo.............: "+this.codigo);
		System.out.println("CPF................: "+this.cpf);
		System.out.println("Nome...............: "+this.nome);
		System.out.println("Endereço...........: "+this.endereco);
		System.out.println("Numero.............: "+this.numero);
		System.out.println("Complemento........: "+this.complemento);
		System.out.println("Bairro.............: "+this.bairro);
		System.out.println("Cidade.............: "+this.cidade);
		System.out.println("Estado.............: "+this.estado);
		System.out.println("Telefone...........: "+this.telefone);
		System.out.println("Celular............: "+this.celular);
		System.out.println("Email..............: "+this.email);
		System.out.println("Salario............: "+this.salario);
		System.out.println("Sexo...............: "+this.sexo);
	}
}
