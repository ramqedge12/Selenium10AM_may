package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test
  public void f() 
	{
		System.out.println(" C PSD");
  }
	
	@Test
	  public void a() 
	{
		System.out.println("LOGIN12");
	  }
	
	@Test
	  public void b() 
	{
		System.out.println("LOGIN1234");
	  }
	@Test
	  public void z() 
	{
		System.out.println("LOGIN");
	  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("LAUNCH");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("CLOSE");
  }

}
