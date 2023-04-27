import java.util.Arrays;

public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5, 7, 1, 1, 2, 3, 22};
		int numMax=array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i]>numMax) {
				numMax=array[i];
			}
		}
		System.out.println("Número mayor: "+numMax);
		
		int total = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!= numMax) {
				total=total + array[i];
			}
		}
		
		
		System.out.println(Arrays.toString(array)+" -> "+(total));
	
	}

}
