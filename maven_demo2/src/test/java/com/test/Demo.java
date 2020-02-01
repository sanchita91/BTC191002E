package com.test;

import org.junit.Test;

public class Demo {
	//Array is a container which hold more than one value with type and fixed size
	int a[]=new int[3];//by default every array is an object
	
	
	@Test
	public void verify() {
		a[0]=6;
		a[1]=56;
	    a[2]=36;
	    a[3]=96;
	    int[] c= {3,7,5,8,9};
	    System.out.println("second hightest num is" + secondHighestNum(c));
	}
	public void getMaxNum (int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
			System.out.println(max);
			
		}
		
	}
	//    AbcdefgA
	// 2nd loop ending
	public void duplicateNum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println("duplicate");
					
				}
			}
		}
		
		
	}
	public int secondHighestNum(int a[])
	{
	//4,6,5,87,45,67
		int highest=a[0];
		int secondHighest=a[1];
		if(secondHighest>highest)
		{
			highest=secondHighest;
			secondHighest=highest;
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]>highest)
			{
				secondHighest=highest;
				secondHighest=a[i];
			}
			else if (a[i]<highest && a[i]> secondHighest)
			{
				secondHighest=a[i];
			}
		}
		return secondHighest;
	}

}
