package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
/* Problema "consumo" 
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de 
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo médio do carro, com três
casas decimais.*/


public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia Percorrida: ");
			double distancia = sc.nextDouble();
			
		System.out.print("Combustivel Gasto: ");
			double combustivel = sc.nextDouble();
		
		double consumo = 	distancia / combustivel;
			
			
		System.out.printf("Consumo medio =  %.3f%n", consumo);
		
		
				
		sc.close();
	}

}
