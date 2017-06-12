package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest12 {
  
	@Test(priority=1)
  public void A() {
	  System.out.println("C/A");
  }
  
  @Test(priority=0, enabled=false)
  public void Z() {
	  System.out.println("LOGOUT");
  }
  
  @Test(priority=2)
  public void B() {
	  System.out.println("LOGIN");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("LAUNCH");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("CLOSE");
  }

}
