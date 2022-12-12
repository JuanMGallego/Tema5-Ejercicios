package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		double nums[] = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 5 n�meros reales: ");
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = sc.nextDouble();
			
		}
		
		double min = nums[0], max = nums[0];
		
		System.out.println();
		
		for (int i = 1 ; i < nums.length ; i++) {
			
			if (nums[i] < min) {
				
				min = nums[i];
				
			}
			
			if (nums[i] > max) {
				
				max = nums[i];
				
			} 
			
		}
		
		System.out.println("El n�mero m�s peque�o es " + min + " y el m�s grande es " + max);

		sc.close();
		
	}

}
