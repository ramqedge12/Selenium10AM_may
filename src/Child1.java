class Parent
{
    public void p1()
    {
        System.out.println("Parent method");
    }
}




public class Child1  extends Parent{
    
	public void c1()
    {
        System.out.println("Child method");
    }
	
	
	
    public static void main(String[] args)
    {
        Child1 cobj = new Child1();
        cobj.c1();   //method of Child class
        cobj.p1();   //method of Parent class 
    }
}






