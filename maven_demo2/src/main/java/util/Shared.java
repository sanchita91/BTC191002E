package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	
	public static Properties readProp(String path) throws IOException {
		File fi=new File(path);
		FileInputStream f=new FileInputStream(fi);
		Properties prop=new Properties();
		prop.load(f);
		return prop;
	}

public void nestedLoop()	{
	//open blank browser
	ChromeDriver dr=new ChromeDriver();
	//go to express.com
	dr.get("https://www.aarong.com/");
	dr.findElement(By.xpath("//*[@id=\"menu4\"]/div/a/span")).click();
	int subMenu=dr.findElements(By.xpath("//div[@class=\"inner2column-right\"]/ul/li")).size();
	for(int j=1;j<=subMenu;j++) {
		dr.findElement(By.xpath("//div[@class=\"inner2column-right\"]/ul/li")).click();
		dr.navigate().back();
	}
	
}
	
}
