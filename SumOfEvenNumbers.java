package Thursdaylab;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        n=sc.nextInt();
        
        for(i=2;i<=n;i=i+2)
        {
        
        	sum=sum+i;
        	sc.close();
        	
        }
        
	System.out.println("sum of all even numbers from 1 to "+n+" is :" +sum);

	}

}
