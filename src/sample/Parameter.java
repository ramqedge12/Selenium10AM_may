package sample;

public class Parameter {
	int c;
	
	public void add(int a, int b)
	{
		 c=a+b;
		System.out.println(c);	
	}
	public static void main(String[] args) {
		
		Parameter obj=new Parameter();
		obj.add(100, 30);
	}

}










