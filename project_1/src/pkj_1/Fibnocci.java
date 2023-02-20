package pkj_1;

public class Fibnocci 
	{
		public static void main(String[] args) 
		{
			int ajay=0,moji=1;
		System.out.println("fibanocci series is");
			for(int i=1; i<=12;++i)
			{
		System.out.println(ajay+",");
				int sahil=ajay+moji;
				moji=ajay;
				ajay=sahil;
		}
		}
	}