package sort;

public class Insertionsort {

	public static void main(String[] args) {
		int[] array= { 5, 20, 15, 7, 1, 22};
		
		for(int firstunsorted = 1 ; firstunsorted < array.length; firstunsorted++)
		{
			int newsort = array[firstunsorted];
			
			int i;
			
			for(i = firstunsorted; i > 0 && array[i-1] > newsort; i--) {
				array[i] = array[i-1];
			}
			
			array[i] = newsort;
		}
		
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]);
		}
		
	}

}
