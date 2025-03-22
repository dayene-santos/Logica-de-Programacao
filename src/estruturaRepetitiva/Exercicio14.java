/*Problema "divisao" (adaptado de URI 1116) 
Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo 
segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”. */

package estruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numerador, denominador, x;
		double divisao;
		
		System.out.print("Quantos casos você vai digitar? ");
			x = sc.nextInt();
			
			for(int i=0; i<x; i++) {
				System.out.print("Entre com o numerador: ");
					numerador = sc.nextInt();
					
				System.out.print("Entre com o denominador ");
					denominador = sc.nextInt();
					
					if(denominador ==0) {
						System.out.println("DIVISÃO IMPOSSÍVEL");
					
					} else {
						divisao = (double) numerador/denominador;
						System.out.printf("DIVISAO = %.2f\n", divisao);
					}
			}
			
		
		
		sc.close();

	}

}
