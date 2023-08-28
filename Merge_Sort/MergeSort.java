package Merge_Sort;

public class MergeSort {
	void Merge(int array[], int low, int mid, int high)
	{
		int c[] = new int[high + 1];
		int i=low, j=mid+1, k=low;
		while(i<= mid && j<=high)
		{
			if(array[i]<array[j])
				c[k++]=array[i++];
			else
				c[k++]=array[j++];
		}
		while(i<=mid)
			c[k++]=array[i++];
		while(j<=high)
			c[k++]=array[j++];
		for(i=low; i<=high; i++)
			array[i] = c[i];
	}
	
	void sort(int array[], int low, int high)
	{
		if(low < high)
		{
			int mid = (low + high)/2;
			sort(array,low,mid);
			sort(array, mid+1, high);
			Merge(array, low, mid, high);
		}
	}
}
