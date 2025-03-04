/*  
Problema "tempo_de_jogo" (adaptado de URI 1046) 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 
horas. */ 

package estruturaCondicional;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			int duracao; 
			
			System.out.print("Hora Inicial: ");
			int horaInicial = sc.nextInt();
			
			System.out.print("Hora Final: ");
			int horaFinal = sc.nextInt();
			
			if (horaFinal > horaInicial) {
				duracao = horaFinal - horaInicial;				
			} else {
				duracao = (24 - horaInicial) + horaFinal;
			}
			
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
			
			
			
			sc.close();

	}

}
