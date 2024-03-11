package br.com.fiap;

import java.util.Scanner;

public class ExercicioJava1 {

	public static void main(String[] args) {
		try {
			double num1, num2, num3, num4 = 0;
			Scanner scan;
			scan = new Scanner(System.in);
			System.out.println("Digite as suas 4 notas de provas nesse bimestre: ");
		    num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			num3 = scan.nextDouble();
			num4 = scan.nextDouble();
			System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nValor 3: " + num3 + "\nValor 4: " + num4 );
			System.out.println("Somatoria = " + (num1 + num2 +num3 + num4) /4);
		
		} catch (Exception e) {
		System.out.println("Formato de número incorreto.");

		}
	}
}
