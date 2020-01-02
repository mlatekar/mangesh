//import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		
	//	int num,arr[],temp;
	//	Scanner sr=new Scanner(System.in);
		//num=sr.nextInt();
		String arr[]= {"mangesh", "kumar","rajnish","samrin"};
		String temp;
		int num=arr.length;
/*		for(int i=0;i<num;i++)
		{
			arr[i]=sr.nextInt();
			
		}  */                          
		System.out.println("Before sort  :");
	
		
		for(int i=0;i<num;i++)
		{

			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num-i-1;j++)
			{
				if(arr[j].compareToIgnoreCase(arr[j+1])>0) //arr[j]>arr[j+1]
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}System.out.println("\nAfter sort  :");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

		
	}

}
