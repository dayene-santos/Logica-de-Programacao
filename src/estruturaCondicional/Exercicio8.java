/* Problema "temperatura" 
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para 
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser 
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com 
duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve 
deduzir a fórmula de Celsius para Fahrenheit): ) 32 ( 9
 5   F C */




package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Representa uma configuração regional, como idioma e formato de moeda, número e data
		Scanner sc = new Scanner(System.in);


		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
			char temperatura = sc.next().charAt(0);
			
		if (temperatura == 'C' ) {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double cParaF = (c * (9.0/5)) + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n",cParaF);
		} else if (temperatura == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double f = sc.nextDouble();
			double fParaC = (5.0/9) * (f-32);
			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", fParaC);
		} else {
			System.out.println("Opção inválida! Digite 'C' para Celsius ou 'F' para Fahrenheit.");
		}
					
		sc.close();
	}

}
