package pkj_1;

public class father 
{
	public father() 
	 {
		 this(12,46,86);
		System.out.println("default parent constructor");
	} 
	 public father(int a) 
	 {
		 this();
		System.out.println("one parameterized parent constructor");
	} 
	 public father(int a, int b) 
	 {
		this(80);
		 System.out.println("two parameterized parent constructor");
	} 
	 public father(int a, int b, int c) 
	 {
		System.out.println("three parameterized parent constructor");
	} 

}
