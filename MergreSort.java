import java.util.*;
public class MergreSort {
	static void divide(int arr[], int low, int high)
	{
		int mid;
		if(low<high)
		{
			
			mid = (low + high) / 2;
			divide(arr, low, mid);
			divide(arr, mid+1, high);
			conquer(arr, low, mid, high);
		}
	}
	
	static void conquer(int list[], int low,int mid,int high)
	{
		
		
		int begin1, end1, begin2, end2,i,k;
		int temp[]=new int[20];
		 i = low; 
		begin1=low;
		 end1=mid;
	    begin2=mid+1;
	    end2=high;
	    while ((begin1 <= end1) && (begin2 <= end2))
	    {
	        if (list[begin1] <= list[begin2])
	        {
	            temp[i] = list[begin1];
	            begin1++;
	        }
	        else
	        {
	            temp[i] = list[begin2];
	            begin2++;
	        }
	        i++;
	    }
	    if (begin1 > end1)
	    {
	        for (k = begin2; k <= end2; k++)
	        {
	            temp[i] = list[k];
	            i++;
	        }
	    }
	    else
	    {
	        for (k = begin1; k <= end1; k++)
	        {
	             temp[i] = list[k];
	             i++;
	        }
	    }
	 
	    for (k = low; k <= high; k++)
	    {
	        list[k] = temp[k];
	    }		
	}
	


public static void main(String args[])
{
int arr[]={5,6,4,7,3,8,2,1,9};
int high=(arr.length-1),low=0;
System.out.println("before sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]+" ");
}
System.out.print("\n");
divide(arr,low,high);
System.out.println("After sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]+" ");
}
}
}
