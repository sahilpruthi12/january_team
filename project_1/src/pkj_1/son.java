package pkj_1;

public class son extends father
{
	public son() 
	{
	this(10,15);
		System.out.println("default child constructor");
	}
	public son(int a) 
	{
	this(12,24,36);
		System.out.println("one parameterized child constructor");
	}
	public son(int a, int b) 
	{
	super(12,42);
		System.out.println("two parameterized child constructor");
	}
	public son(int a , int b , int c) 
	{
	this();
		System.out.println("three parameterized child constructor");
	}
	public static void main(String[] args) 
	{
		son obj= new son(12);
		}

}
