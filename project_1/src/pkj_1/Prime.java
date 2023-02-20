package pkj_1;

import java.util.Scanner;

public class Prime 
{
public static void main(String[] args) 
{
System.out.println("please enter value of a");
Scanner s= new Scanner(System.in);
int a=s.nextInt();
int half=a/2;
int b=0;
for(int i=2; i<=half;i=i+1) 
{
	if(a%i==0)
	{
	System.out.println("it is not a prime no"+a);
	b=1;
	break;
	}
	if(b==0)
	{
		System.out.println("it is a prime no"+a);
	}
	}
}
}

