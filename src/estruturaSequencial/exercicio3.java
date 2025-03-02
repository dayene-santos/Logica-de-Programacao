package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;


// Problema "idades"  
/* Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
 *nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. */

public class exercicio3 {
	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dados da primeira pessoa:");
			System.out.print("Nome: ");
				String nome1 = sc.nextLine();
			System.out.print("Idade: ");
				int idade1 = sc.nextInt();
				sc.nextLine();
				
			System.out.println("Dados da segunda pessoa:");
			System.out.print("Nome: ");
				String nome2 = sc.nextLine();
			System.out.print("Idade: ");
				int idade2 = sc.nextInt();
				
			double avg = (idade1 + idade2)/2.0;
			System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome1, nome2, avg);		
			
			sc.close();

	}

}
