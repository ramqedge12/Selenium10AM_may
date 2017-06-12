package com.ProjName.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void screens(WebDriver driver, String sname) throws IOException
	{
		String spath="E:\\workspace10am_may\\SeleniumProj\\src\\com\\ProjName\\ScreenShots\\"+sname+".png";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src, new File(spath));
	
	}
	

}
