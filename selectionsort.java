
public class selectionsort {

	public static void main(String[] args) {
		

		String arr[]= {"mangesh","rohan","rock","kumar","rajnish"};
		int num=arr.length;
		String temp;
		
		System.out.println(" Selection sort  :");
		
		System.out.println("\nbefore sorting  :");
		for(int i=0;i<num;i++) 
		{
			System.out.print(arr[i]+" ");	
		}
		
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<num;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("\nAfter sotring :");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
