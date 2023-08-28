package Merge_Sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[], n,i;
		System.out.println("Enter the number of elements to be sorted");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter the elements to be sorted");
		for(i=0;i<n;i++)
			array[i] = sc.nextInt();
		MergeSort Obj = new MergeSort();
		Obj.sort(array, 0,n-1);
		System.out.println("The sorted array is : ");
		for(i=0;i<n;i++)
			System.out.println(array[i]);
	}

}
