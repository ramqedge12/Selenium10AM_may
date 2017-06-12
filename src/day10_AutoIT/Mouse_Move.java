package day10_AutoIT;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.testng.annotations.Test;

public class Mouse_Move {
  @Test
  public void f() throws AWTException {
	  
	  Robot rb=new Robot();
	  
	Dimension rc= Toolkit.getDefaultToolkit().getScreenSize();
	  System.out.println(rc);
	  
	  rb.mouseMove(480, 85);
	  
	  rb.delay(3000);
	  
	  rb.mousePress(InputEvent.BUTTON1_MASK);
	  rb.mouseRelease(InputEvent.BUTTON1_MASK);
	  
	  rb.delay(5000);
	  
  }
}



