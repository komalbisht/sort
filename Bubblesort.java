package sort;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] array = {5,20,15,7,1,22};
		
		for(int last=array.length-1 ; last>0 ; last--) 
		{
			for(int i=0 ; i<last ; i++) 
			{
				if(array[i]>array[i+1])
					swap(array,i,i+1);
			}
		}
		
		for(int i=0;i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}

	public static void swap(int[] arr,int i, int j) {
		
		if(i==j) {
			return;
		}
		
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}

}
