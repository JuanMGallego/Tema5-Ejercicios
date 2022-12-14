package tema5ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int numeros[] = new int[20];
		int cuadrados[] = new int[20];
		int cubos[] = new int[20];
		
		for (int i = 0 ; i < numeros.length ; i++) {
			
			numeros[i] = (int) (Math.random()*100 + 1);
			
			cuadrados[i] = (int) (Math.pow(numeros[i], 2));
			
			cubos[i] = (int) (Math.pow(numeros[i], 3));
			
		}
		
		for (int i = 0 ; i < numeros.length ; i++) {
			
			System.out.println(numeros[i] + "\t" + cuadrados[i] + "\t" + cubos[i]);
			
		}

	}

}
