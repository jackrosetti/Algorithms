import java.util.*;
public class BubbleSort{

	public static void bubbleSort(int arr[]){
	  for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		Random r = new Random();

		int arr[] = new int[r.nextInt(1000)];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(2000);
		}
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
}
