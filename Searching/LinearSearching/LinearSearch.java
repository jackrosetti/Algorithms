import java.util.*;
public class LinearSearch{
	public static void main(String[] args)
	{
		Random r = new Random();
		LinearSearch linearSearch = new LinearSearch();
		int arr[] = new int[r.nextInt(20)];
		for(int j = 0; j < arr.length; j++){
			arr[j] = r.nextInt(2000);
		}
		int n = arr[r.nextInt(arr.length)];
		System.out.println(linearSearch.linearSearch(arr, n));
	}

	int linearSearch(int arr[], int n){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n)
				return i;
		}
		return -1;
	}
}
