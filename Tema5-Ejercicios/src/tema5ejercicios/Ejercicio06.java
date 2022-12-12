package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		double nums[] = new double[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 10 números reales: ");
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = sc.nextDouble();
			
		}
		
		System.out.println();
		
		for (int i = nums.length ; i >= 0 ; i--) {
			
			System.out.println(nums[i--]);
			
		}
		
		sc.close();

	}

}
