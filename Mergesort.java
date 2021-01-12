package sort;

public class Mergesort {

	public static void main(String[] args) {
		
		int[] array = {5,20,15,7,1,22};
		
		sorting(array, 0 ,array.length);

		
		for (int num =0; num < array.length ; num++) {
			System.out.println(array[num]);
		}
	}
	
	public static void sorting(int[] input, int start, int end) {
		if (end - start < 2) {
			return;
		}
		
		int mid = (start+end)/2;
		
		sorting(input, start, mid);
		sorting(input, mid, end);
		merge(input, start, mid, end);
	}
	
	public static void merge(int[] input, int start, int mid, int end) {
		
		if( input[mid] > input[mid-1] ) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		
		while (i < mid && j <end) 
		{
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}

}
