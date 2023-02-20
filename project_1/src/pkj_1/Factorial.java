package pkj_1;

import java.util.Scanner;

public class Factorial 
{
public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
System.out.println("please enter the no");
int a=s.nextInt();
int f=1;

for(int i=a;i>=1;i=i-1)
{
	f=f*i;
}
	System.out.println("factorial of a given number is"+f);

}
}
