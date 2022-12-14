package tema5ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int temp[] = new int[12];
		int mes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la temperatura media de cada mes: ");
		
		for (int i = 0 ; i < temp.length ; i++) {
			
			temp[i] = sc.nextInt();
			
		}
		
		System.out.println();
		
		for (int valores : temp) {
			
			mes++;
			
			System.out.print("Mes " + mes + ":\t");
			
			for (int i = 0 ; i < valores ; i++) {
				
				System.out.print("#");
				
			}
			
			System.out.println();
			System.out.println();
			
		}
		
		sc.close();

	}

}
