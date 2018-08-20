package binarySearch;

public class BinarySearch {
	public static int binarySearch(int [] array, int value) {
		int first = 0;
		int last = array.length - 1;
		int middle;
		int position = -1;
		boolean found = false;
		while(!found && first <= last) {
			middle = (first + last) / 2;
			if(array[middle] == value) {
				found = true;
				position = middle;
			}else if(array[middle] > value) {
				last = middle - 1;
			}
			else {
				first = middle + 1;
			}
		}
		return position;
	}
	
	public static int convertToBinary(int x) {
		if(x == 1) return x%2;
		return convertToBinary(x/2) * 10 + x % 2;
	}
	
	public static int [] arrayInsert(int arr[], int x, int val) {
		int [] b = new int[arr.length + 1];
		for(int i = 0; i < x; i++) {
			b[i] = arr[i];
		}
		
		b[x] = val;
		
		for(int i = x + 1; i < b.length; i++) {
			b[i] = arr[i - 1];		
		}
		return b;
	}
	
	public static boolean isPrime(int x) {
		int num = 2;
		while(num < x) {
			if(x % num == 0) return false;
			num++;
		}
		return true;
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[i];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min_idx])
					min_idx = j;
				
				int temp = arr[min_idx];			
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = {5,2,3,4,7};
		int arr2[] = {8,2,1,4,3};
		
		
		int value = 4;
		System.out.println("Is 5 prime: " + isPrime(5));
		
		System.out.println("found position at  " + binarySearch(arr, value));
		arr = arrayInsert(arr, 3, 5);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Is 5 prime: " + isPrime(5));
		System.out.println("Before Bubble Sort");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		bubbleSort(arr1);
		System.out.println("\nAfter sort");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		
		System.out.println("\nBefore Selection Sort");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		selectionSort(arr2);
		System.out.println("\nAfter sort");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n" +convertToBinary(132));
		
		
		
	}
	
	
}
