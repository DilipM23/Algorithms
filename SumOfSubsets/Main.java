package SumOfSubsets;

import java.util.Scanner;

public class Main {
	static int set[] = new int[20];
	static int sol[] = new int[20];
	static int target, n;
	static int count = 0;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the set");
		n = sc.nextInt();
		for(int i = 0;i < n;i++)
			set[i] = sc.nextInt();
		System.out.println("Enter the target sum");
		target = sc.nextInt();
		int sum = 0;
		for(int i =0;i < n;i++)
			sum += set[i];
		if(sum < target)
			System.out.println("There is no solution set");
		else
			subset(0, 0, sum);
	}
	
	static void subset(int sumsofar, int index, int remsum)
	{
		sol[index] = 1;
		if(sumsofar + set[index] == target)
		{
			System.out.println("Solution number :"+(++count));
			for(int i =0;i <= index;i++)
				if(sol[i] == 1)
					System.out.println(set[i]+" ");
		}
		else if(sumsofar + set[index] + set[index] <= target)
			subset(sumsofar+set[index], (index+1), remsum - set[index]);
		if(sumsofar + set[index+1] <= target && (sumsofar + remsum - set[index] >= target))
		{
			sol[index] = 0;
			subset(sumsofar, index+1, remsum-set[index]);
		}
	}
}
