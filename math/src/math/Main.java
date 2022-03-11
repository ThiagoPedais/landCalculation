package math;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area do retangulo ===> A = b*h
		
		double a, b, v = 0, h, vt;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite a largura do terreno: ");
		b = sc.nextDouble();		
		System.out.println("Digite o comprimento do terreno: ");
		h = sc.nextDouble();
		
		
		System.out.println("Digite o valor do metro quadrado: ");
		v = sc.nextDouble();
		
		System.out.println("");
		
		a = b*h;
		vt = v * a;
		
		Locale.setDefault(Locale.US);
		System.out.printf("Area do terreno = %.2f%n", a);
		System.out.printf("Valor total do terreno é = R$ %.2f%n", vt);
	
		
		sc.close();

	}

}
