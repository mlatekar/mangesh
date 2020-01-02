import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
 
		int n,search;
		int arr[];
		
		Scanner sr=new Scanner(System.in);
		
		System.out.print("Enter numbers :");
		n=sr.nextInt();
		arr=new int[n];
		
		System.out.print("Enter the numbers of integer  :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
		
		System.out.println("Enter number to find :");
		search=sr.nextInt();
		
		int mid,first,last;
		first=0;
		last=n-1;
		mid=first+last/2;
		
		while(first<last)
		{
			mid=last+first/2;
			if(arr[mid]<search)
			{
				first=mid+1;
				
			}
			else if(arr[mid]==search)
			{
				System.out.println(search+" found at "+mid);
				break;
			}
			else
			{
				last=mid-1;
				
			}
			
		}
	}
}
