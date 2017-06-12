package com.ProjName.TestExe_Main;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.ProjName.ReuseFun.Actionkw;

public class NewTest {
  @Test
  public void f() {
	  
	  Actionkw obj=new Actionkw();
	  
	 obj.launchBrowser();
	  obj.navigate();
	 obj.enterUsername();
	 obj.enterPassword();
	  obj.clickLogin();
	  
  }
}
