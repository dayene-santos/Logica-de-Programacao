package estruturaSequencial;

/* Problema "medidas" 
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados 
com quatro casas decimais): 
a) a área do quadrado que tem lado A 
b) a área do triângulo retângulo que base A e altura B 
c) a área do trapézio que tem bases A e B, e altura C */


import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, trapezio, quadrado;
		
		System.out.print("Digite a medida A: ");
			A = sc.nextDouble();
			
		System.out.print("Digite a medida B: ");
			B = sc.nextDouble();
			
		System.out.print("Digite a medida C: ");
			C = sc.nextDouble();
			
		triangulo = A * B / 2;  // base * altura / 2
		trapezio = (A + B) / 2 * C;// base + base / 2 * altura
		quadrado = A * A;  // lado ²
				
		System.out.printf("QUADRADO: %.4f%n", quadrado);
		System.out.printf("TRIANGULO: %.4f%n", triangulo);
		System.out.printf("TRAPZEIO: %.4f%n", trapezio);
		
		
				sc.close();
	}

}