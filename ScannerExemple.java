
import java.util.Scanner;

 class ScannerExemple {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String nome = "";
        
        System.out.println("Digite seu nome: ");
        
        nome = input.next();
        
        System.out.printf("\nMeu nome é %s", nome);
    }
}
