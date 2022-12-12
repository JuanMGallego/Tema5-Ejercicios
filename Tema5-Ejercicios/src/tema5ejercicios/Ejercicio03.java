package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		double nums[] = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 5 números decimales: ");
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = sc.nextDouble();
			
		}
		
		System.out.println();
		
		for (double values : nums) {
			
			System.out.println(values);
			
		}
		
		sc.close();

	}

}
