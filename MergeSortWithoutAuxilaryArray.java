
import java.util.*;
public class MergreSort {
	static void divide(int list[], int low, int high)
	{
		int mid;
		if(low<high)
		{
			
			mid = (low + high) / 2;
			divide(list, low, mid);
			divide(list, mid+1, high);
			conquerWithoutTempArray(list, low, mid, high);
			
		}
	}
	
	
static void conquerWithoutTempArray(int list[], int low, int mid, int high)
{
int begin1=low, end1=mid, begin2=mid+1, end2=high, temp;
while((begin1<=end1) && (begin2<=end2))
{
 if(list[begin1]<list[begin2])
 {
	 begin1++;
 }
  if(list[begin1]>=list[begin2])
 {
	 temp=list[begin2];
	 for(int i=begin2; i>=begin1+1;i--)
	 {
		list[i]=list[i-1]; 
	 }
	 list[begin1]=temp;
	 begin1++;
	 begin2++;
 }
}

}

public static void main(String args[])
{
System.out.println("Enter the size of the array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int list[]=new int[size];
for(int i=0;i<size;i++)
{
  System.out.println("Enter element "+(i+1));
  list[i]=sc.nextInt();
}
int high=(list.length-1),low=0;
System.out.println("before sorting:");
for(int i=0;i<list.length;i++)
{
System.out.print(" "+list[i]+" ");
}
System.out.print("\n");
divide(list,low,high);
System.out.println("After sorting:");
for(int i=0;i<list.length;i++)
{
System.out.print(" "+list[i]+" ");
}
sc.close();
}
}
