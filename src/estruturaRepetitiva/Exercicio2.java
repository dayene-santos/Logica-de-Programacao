/* Problema "media_idades"  
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um 
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular 
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, 
mostrar a mensagem "IMPOSSIVEL CALCULAR".*/ 

package estruturaRepetitiva;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades: ");
			int idade = sc.nextInt();
			
			 if (idade < 0) {
			    	System.out.println("IMPOSSIVEL CALCULAR");
			    }
			    else {
					int soma = 0; // Armazena a soma das idade
					int nIdades = 0; // Contador de quantas idades foram inseridas
			        while (idade >= 0) {
			            soma = soma + idade; // Soma a idade ao total
			            nIdades++; //Incrementa o número de idades inseridas
			            idade = sc.nextInt();
			        }

			        double media = (double) soma / nIdades;

			        System.out.printf("MEDIA = %.2f\n", media);
			    }
		sc.close();
		

	}

}
