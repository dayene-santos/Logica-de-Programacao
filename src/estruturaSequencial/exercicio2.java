package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

//Problema "retangulo" 
/*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
 *da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
*/
public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = 0;
		double largura =0;
		
		System.out.print("Base do retangulo: ");
			largura = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
			altura = sc.nextDouble();
			
		double area = largura * altura;
		double perimetro = (largura + altura) + (largura + altura);
		double diagonal = Math.sqrt(largura * largura + altura * altura);
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
