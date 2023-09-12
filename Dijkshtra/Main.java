package Dijkshtra;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices :");
		int n = sc.nextInt();
		int adj[][] = new int[n][n];
		System.out.println("Enter the weighted matrix");
		for(int i =0; i <n; i++)
			for(int j=0; j < n; j++)
				adj[i][j] = sc.nextInt();
		int dist[] = dijkshtra(adj);
		System.out.println("The shortest distance from source to other vertices is :");
		for(int i =0; i < n;i++)
			System.out.print(dist[i]+" ");
	}
	
	static int[] dijkshtra(int[][] adj)
	{
		Scanner sc = new Scanner(System.in);
		int n = adj.length;
		int dist[] = new int[n];
		boolean visited[] = new boolean[n];
		System.out.println("Enter the source vertex:");
		int src = sc.nextInt();
		int i, j, unvis = 0, min;
		for(i = 0;i < n;i++) {
			dist[i] = adj[src][i];
			visited[i] = false;
		}
		visited[src] = true;
		for(i =1; i < n; i++)
		{
			min = 99;
			for(j=0; j < n; j++)
			{
				if(!visited[j] && adj[i][j] < min)
				{
					unvis = j;
					min = adj[i][j];
				}
			}
			visited[unvis] = true;
			for(int v = 0;v < n;v++)
				if(!visited[v] && (dist[unvis]+adj[unvis][v] < dist[v]))
					dist[v] = dist[unvis]+adj[unvis][v];
		}
		return dist;
		
	}
}