package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

		//Problema "terreno"
/*Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
 *casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
 *o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
 *duas casas decimais, conforme exemplo.  */

public class atividade1 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			double larguraTerreno=0;
			double comprimentoTerreno=0;
			double metroQuadrado=0;
						
			System.out.print("Digite a largura do terreno: ");
			larguraTerreno = sc.nextDouble();
			
			System.out.print("Digite o comprimento do terreno: ");
			comprimentoTerreno = sc.nextDouble();
			
			System.out.print("Digite o valor do metro quadrado: ");
			metroQuadrado = sc.nextDouble();
			
			double areaTerreno  = larguraTerreno * comprimentoTerreno;
			double precoTerreno = areaTerreno * metroQuadrado;
			
			System.out.printf("Area do terreno = %.2f%n", areaTerreno);
			System.out.printf("Preco do terreno = %.2f%n", precoTerreno);
					
			
			sc.close();
			
	}

}
