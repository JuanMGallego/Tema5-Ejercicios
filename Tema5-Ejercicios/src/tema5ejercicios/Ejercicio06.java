package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int nums[] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 8 números enteros: ");
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = sc.nextInt();
			
		}
		
		System.out.println();
		
		for (int values : nums) {
			
			if (values % 2 == 0) {
				
				System.out.println(values + " par");
				
			} else {
				
				System.out.println(values + " impar");
				
			}
			
		}
		
		sc.close();

	}

}
