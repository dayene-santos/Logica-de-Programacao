/*Problema "glicose" 
Fazer um programa para ler a quantidade de glicose 
no sangue de uma pessoa e depois mostrar na tela a 
classificação desta glicose de acordo com a tabela de 
referência ao lado.*/

package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite a medida da glicose: ");
				double glicose = sc.nextDouble();
			
				if(glicose < 100) {
					System.out.print("Classificação: normal");
				} else if (glicose > 100 && glicose < 140) {
					System.out.print("Classificação: Elevado");
				} else {
					System.out.print("Classificação: Diabetes");
				}
					
					sc.close();
	}

}

