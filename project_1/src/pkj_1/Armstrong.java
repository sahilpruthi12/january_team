package pkj_1;

import java.util.Scanner;

public class Armstrong 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int og=a;
int sum=0;
while(a>0)
{
	int r=a%10;
	sum=sum+r*r*r;
	a=a/10;
	}
if(og==sum)
{
	System.out.println("no is armstrong"+og);
	}
else
	{
	System.out.println("no is not armstrong");
	}
}
}
