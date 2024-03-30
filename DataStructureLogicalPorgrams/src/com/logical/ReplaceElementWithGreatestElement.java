package com.logical;

import java.util.Scanner;

public class ReplaceElementWithGreatestElement {
public static void main(String[] args) {
	//3
	//7 9 6 ->8 8 6
	//5
	//2 4 3 1 0-> 4 4 3 1 0
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]<ar[j]||ar[i]==ar[j]) {
				System.out.println(ar[j]);
				break;
			}
			else if(ar[i]>ar[j]||ar[j]<ar[i]) {
				System.out.println(ar[i]);
				break;
			}

		}
	
	}
}
}
