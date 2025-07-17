import java.util.*;
public class counting{
	public static void countingSort(int arr[]){
		int largest = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}

		int count[] = new int[largest + 1];
		for(int i = 0; i < arr.length - 1; i++){
			count[arr[i]]++;
		}

		for(int i = 0; i < count.length; i++){
			int j = 0;
			while(count[i] > 0){
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}
	public static void printarr(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]){
		int num[] = {1,2,3,4,5,1,2,3,5};
		countingSort(num);
		printarr(num);
	}
}
