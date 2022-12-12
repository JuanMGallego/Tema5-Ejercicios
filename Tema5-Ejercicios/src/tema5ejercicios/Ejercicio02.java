package tema5ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int randomNums[] = new int[10];
		
		int suma = 0;
		
		for (int i = 0 ; i < randomNums.length ; i++) {
			
			randomNums[i] = (int) (Math.random()*100 + 1);
			
		}
		
		for (int i = 0 ; i < randomNums.length ; i++) {
			
			suma += randomNums[i];
			
		}

		System.out.println(suma);
		
	}

}
