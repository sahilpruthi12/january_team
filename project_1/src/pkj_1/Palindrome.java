package pkj_1;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args) 
{
Scanner s= new Scanner(System.in);
System.out.println("please enter the no");
int a=s.nextInt();
int og=a;
int sum =0;
while(a>0)
{
	int r=a%10;
	sum=sum*10+r;
	a=a/10;
}
if(og==sum)
{
	System.out.println("no is palindrome"+ og);
	}
else
{
	System.out.println("no is not palindrome"+og);
	}
}
}
