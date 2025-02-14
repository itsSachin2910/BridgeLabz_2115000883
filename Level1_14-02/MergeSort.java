import java.util.*;
public class MergeSort{
	public static void mergeSort(double[] arr,int left,int right){
		if(left < right){
			int mid = left + (right - left) / 2;

			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
		
			merge(arr,left,mid,right);

		}
	}
	public static void merge(double[] arr,int left,int mid,int right){
		int n1 = mid - left + 1;
		int n2 = right - mid ;

		double[] leftArr = new double[n1];
		double[] rightArr = new double[n2];

		for(int i = 0 ; i < n1 ; i++){
			leftArr[i] = arr[left + i];
		}
		for(int j=0;j<n2;j++){
			rightArr[j] = arr[mid + 1 + j];
		}
		int i=0, j=0, k=left ;
		while(i<n1 && j<n2){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}else{
				arr[k] = rightArr[j];
				j++;
			}
		k++;
		}
		while(i<n1){
		   arr[k] = leftArr[i];
		   i++;
		   k++;
		}

		while(j<n2){
		  arr[k] = rightArr[j];
		  j++;
		  k++;
		}
	}
	public static void main(String[] args) {
        double[] bookPrices = {399.99, 150.50, 499.75, 99.99, 250.25, 325.00};

        System.out.println("Before Sorting: " + Arrays.toString(bookPrices));

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(bookPrices));
    }
}
