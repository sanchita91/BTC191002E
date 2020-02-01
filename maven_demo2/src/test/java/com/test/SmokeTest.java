package com.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import util.Shared;

public class SmokeTest extends BaseTest{
	
		Properties prop;

	@Test
	public void test1() throws IOException {
		
		prop=Shared.readProp("/Users/sanchita/eclipse-workspace/maven_demo2");
		Assert.assertTrue(driver.getTitle().contains(prop.getProperty("title")));
		//or
		if(driver.getTitle().contains(prop.getProperty("title")))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	
	
	}
}
