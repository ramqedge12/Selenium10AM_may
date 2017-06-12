package day5;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriver12 {
	
	public static void main(String[] args) {
		
	HtmlUnitDriver d=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		d.get("http://google.com");
		
		System.out.println(d.getTitle());
		
	}

}





