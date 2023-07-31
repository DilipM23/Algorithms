package Selection_Sort;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i,j;
		System.out.println("Enter the number of elements in an array");
		int n=sc.nextInt();
		int array[]= new int[n];
		SelectionSort obj = new SelectionSort();
		while(true)
		{
			System.out.println("\n\nEnter 1.Best Case\n2.Average case\n3.Worst Case\n4-Exit");
			int op = sc.nextInt();
			switch(op)
			{
				case 1 : 
						for(i=0; i<n; i++)
							array[i]= i;
						long start = System.nanoTime();
						obj.sort(array,n);
						long stop = System.nanoTime();
						System.out.println("\nBest Case : "+(stop-start));
						break;
				case 2 : 
						for(i=0; i<n; i++)
							array[i]= ran.nextInt();
						start = System.nanoTime();
						obj.sort(array,n);
						stop = System.nanoTime();
						System.out.println("\nAverage Case : "+(stop-start));
						break;
				case 3 : 
						j=n-1;
						for(i=0;i<n;i++)
							array[i]=j--;
						start = System.nanoTime();
						obj.sort(array,n);
						stop = System.nanoTime();
						System.out.println("\nWorst Case : "+(stop-start));
						break;
				case 4 : System.exit(0);
			}
		}
	}

}
