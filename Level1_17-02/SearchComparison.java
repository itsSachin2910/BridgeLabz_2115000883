import java.util.*;
public class SearchComparison{
	public static int linearSearch(int[] arr,int target){
		for(int i = 0;i < arr.length ; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	
	}
	public static int binarySearch(int[] arr,int target){
		int left = 0, right = arr.length-1;
		while(left <= right){
			int mid = left + (right-left) / 2 ;
			
			if(arr[mid] == target){
				return mid;
			}else if(arr[mid] < target){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int N = 1_000_000;
		int[] data = new int[N];
		Random random = new Random();

		for(int i=0;i<N;i++){
			data[i] = i;
		}
		int target = random.nextInt(N);

		long startLinear = System.nanoTime();
		int linearResult = linearSearch(data,target);
		long endLinear = System.nanoTime();


		long startBinary = System.nanoTime();
		int binaryResult = binarySearch(data,target);
		long endBinary = System.nanoTime();


		System.out.println("Target : " + target);
		

		System.out.println("Linear Search : ");
		System.out.println("Index: " + linearResult + ",Time: " + (endLinear - startLinear)+ "ns");


		System.out.println("Binary Search : ");
		System.out.println("Index : " + binaryResult + ",Time : " + (endBinary - startBinary)+ "ns");

	}
}
