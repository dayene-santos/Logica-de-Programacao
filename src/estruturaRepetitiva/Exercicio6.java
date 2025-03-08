/* Problema "combustivel" (adaptado de URI 1134) 
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 
4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o 
código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem 
como as quantidades de cada combustível. */

package estruturaRepetitiva;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
				int codigo = sc.nextInt();
					
				int alcool =0, gasolina=0, diesel=0;
				
				while(codigo != 4) {
					
						if(codigo == 1) {
							alcool++;
						} else if(codigo == 2) {
							gasolina++;
						} else if (codigo == 3) {
							diesel++;
					
						}
						
						System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
							codigo = sc.nextInt();
				}	
				

				System.out.println("MUITO OBRIGADO");
			    System.out.printf("Alcool: %d\n", alcool);
			    System.out.printf("Gasolina: %d\n", gasolina);
			    System.out.printf("Diesel: %d\n", diesel);

				
			sc.close();

	}
}
