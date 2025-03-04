/* Problema "notas"  
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de 
uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no 
ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a 
mensagem "REPROVADO", conforme exemplos. */

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite a primeira nota: ");
				double nota1 = sc.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
				double nota2 = sc.nextDouble();
			
			double notaFinal = nota1 + nota2;
			
			if(notaFinal < 60.00) {
				System.out.printf("NOTA FINAL= %.1f%n", notaFinal);
				System.out.print("REPROVADO");
			} else {
				System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			}
				
			
			sc.close();
	}

}
