package tema5ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int randomNums[] = new int[10];
		
		for (int i = 0 ; i < randomNums.length ; i++) {
			
			randomNums[i] = (int) (Math.random()*100 + 1);
			
			System.out.println(randomNums[i]);
			
		}

	}

}
