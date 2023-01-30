package pkj_1;

public class arman extends sahil
{
	public void methodA()
	{
		this.methodABC(15,46);
	System.out.println("default child method");	
	}
	public void methodAB(int a)
	{
		this.methodA();
	System.out.println("one parameterized child method");	
	}
	public void methodABC(int a , int b)
	{
		super.method();
		super.method2(8, 9);
		super.method1(5);
		super.method3(10,15,26);
		System.out.println("two parameterized child method");	
	}
	public void methodABCD(int a , int b , int c)
	{	
		this. methodAB (12);
	System.out.println("three parameterized child method");
	}
	public static void main(String[] args) 
	{
	arman obj=new arman();
	obj.methodABCD(12,21,13);
	}

}
