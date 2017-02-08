public class Programming2 {
public static void main(String argv[])
{
int count=0;
for(int i=1;i<=1000000;i++)
{
 if(i%9==0||i%13==0||i%27==0||i%81==0)
 {
	 count++;
 }
}
 System.out.println("The total number of numbers between 1 and 1 million that are evenly divisible by 9, 13, 27, or 81 :"+count);
}
}
