package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int nums[] = new int[100];
		int pos;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = (int) (Math.random()*10 + 1);
			
		}
		
		System.out.print("Introduzca un numero para buscar sus posiciones: ");
		pos = sc.nextInt();
		System.out.println();
		
		System.out.print("Se en cuentra en las posiciones: ");
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			if (nums[i] == pos) {
				
				System.out.print(" " + i + ",");
				
			}
			
		}

	}

}
