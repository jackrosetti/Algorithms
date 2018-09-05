import java.util.*;
public class SelectionSort{

	public static void main(String[] args){
		Random r = new Random();
		int arr[] = new int[r.nextInt(40)];
		for(int j = 0; j < arr.length; j++){
			arr[j] = r.nextInt(5000);		
		}
		selectionSort(arr);
	}

	public static void selectionSort(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			if(i != min){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}

}
