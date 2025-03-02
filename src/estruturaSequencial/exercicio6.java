package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
/*
 * Problema "circulo"  
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do 
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋.𝑟 . Você pode 
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use 
diretamente o valor 3.14159.  
 */
public class exercicio6 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o valor do raio do circulo: ");
			double raio = sc.nextDouble();
			double pi = 3.14159;
			
			double area = pi * (raio * raio);
			
			System.out.printf("AREA = %.3f%n", area);
			
	
	sc.close();
	
	}
}