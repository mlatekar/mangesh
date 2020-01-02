package com.bridgelabz.bootcampprograms;

public class pattern1 {
	public static void main(String[]args)
	{
		int space=4,str=1,i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
		for(j=1;j<=str;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		str+= 2;
		
		}
		
	}

}
