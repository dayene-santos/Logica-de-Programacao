/* Problema "experiencias" (adaptado de URI 1094) 
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este 
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia 
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um 
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um 
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo 
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de 
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o 
percentual deve ser apresentado com dois dígitos após o ponto.*/

package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int N, cobaia=0, C=0, R=0, S=0;
		double pC=0, pR=0, pS=0;
		char tipo_cobaia = 0;		
		
		System.out.print("Quantos casos de teste serão digitados? ");
			N = sc.nextInt();
		
			for(int i=0; i<N; i++) {
				System.out.print("Quantidade de cobaias: ");
					cobaia = sc.nextInt();
					sc.nextLine();
				
				System.out.print("Tipo de cobaia: ");
					tipo_cobaia = sc.nextLine().charAt(0);
					
					if(tipo_cobaia == 'C') {
						C += cobaia;
					} else if (tipo_cobaia == 'R') {
						R += cobaia;
					} else if(tipo_cobaia == 'S') {
						S += cobaia;
					}
					
				
			}
				int totalCobaias = C + R + S;
				
		        pC = (totalCobaias == 0) ? 0.0 : ((double) C / totalCobaias) * 100;
		        pR = (totalCobaias == 0) ? 0.0 : ((double) R / totalCobaias) * 100;
		        pS = (totalCobaias == 0) ? 0.0 : ((double) S / totalCobaias) * 100;
						
			
				System.out.println("\nRELATÓRIO FINAL:");
		        System.out.printf("Total: %d cobaias \n", totalCobaias);
		        System.out.printf("Total de coelhos: %d\n", C);
		        System.out.printf("Total de ratos: %d\n", R);
		        System.out.printf("Total de sapos: %d\n", S);
		        System.out.printf("Percentual de coelhos: %.2f%\n", pC);
		        System.out.printf("Percentual de ratos: %.2f%\n", pR);
		        System.out.printf("Percentual de sapos: %.2f%\n", pS);
					
		sc.close();

			
	}
}
