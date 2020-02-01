package com.test;

import org.junit.Test;

public class StringManupolation {
	String s="how are you";
	String s1=new String("how are you");
	StringBuffer sb=new StringBuffer("how are you");
	
	@Test
	public void test1() {
		String s2=s.concat("doing");
		System.out.println(sb);
		sb.append("doing");
		System.out.println(sb);
		char c=s.charAt(2);
		int v="how".compareTo("how");
		"How".compareToIgnoreCase("how");
		System.out.println(v);
		boolean b= s.contains("you");
		s.endsWith("you");
		s.equals(s2);//value are equal or not
		if(s1==s2) {
			
		}
		s.equalsIgnoreCase("");
		int h="bA".hashCode();
		int h1="bAa".hashCode();
		if(h==h1) {
			
		}
		//from first to find thirsd a
		//united state of america
		int a1=s.indexOf('a');
		int a2=s.indexOf('a', a1+1);
		int a3=s.indexOf('a', a2+1);
		System.out.println(s.charAt(a3));
		//from last to find a
		int a4=s.lastIndexOf('a');
		int a5=s.lastIndexOf('a', a4-1);
		int a6=s.lastIndexOf('a', a5-1);
		System.out.println(s.charAt(a6));
		
		boolean b3=s.isEmpty();
		s.length();
		s.length();
		s.replace("you", "u");
		s.replaceAll("%,^", "");
		
		String s6[]=s.split(" ");
		
		//array holds more than one value with same type by index in memory
		//memory aleays start from a on the other hand length start from 1 that means
		//lenght always one bigger than index
		
		for(int i=0; i>s6.length;i++) 
		{
			
			System.out.println(s6[i]);
		}
		s.startsWith("how");
		s.substring(9);
		s.subSequence(4, 6);
		//reverse a string
		StringBuffer sb=new StringBuffer();
		char ch[]=s.toCharArray();
		for (int i= ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		System.out.println(sb);
		//string reverse by word
		StringBuffer sb1=new StringBuffer();
		String s7[]=s.split(" ");
		for()
		
		
		
	}
	

}
