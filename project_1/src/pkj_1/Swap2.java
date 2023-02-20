package pkj_1;

public class Swap2 
{
	public static void main(String[] args) 
	{
	int a=30;
	int b=35;
System.out.println("value of a is"+a);
System.out.println("value of b is"+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a"+a);
System.out.println("value of b"+b);
	}	
}
