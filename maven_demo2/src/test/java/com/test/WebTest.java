package com.test;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	public String[] acValue(List <WebElement> elements) {
		int i=0;
		String []av=new String[elements.size()];
		for( WebElement ele:elements)
		{
			String v=ele.getText();
			av[i]=v;
			i++;
		}
		return av;
	}
	@Test
	public void test2() {
		WebDriver dr=new ChromeDriver();
		String exV[]= {"Men","Women"};
		String acV[]= acValue(dr.findElements(By.xpath("")));
		for(int i=0;i<exV.length;i++) {
			if (exV[i]==acV[i]) {
				System.out.println("match");
			
			}else
			{
				System.out.println("not");
			}
		}
	
	
	
}
}
