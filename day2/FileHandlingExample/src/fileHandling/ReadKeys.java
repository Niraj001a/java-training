package fileHandling;

import java.io.*; 
class ReadKeys { 
 public static void main (String args[]) { 
	 StringBuffer sb = new StringBuffer(); 
	 char ch;
 	try {
	while((ch =(char)System.in.read()) != '\n') 
		{ 
			sb.append(ch); } 
		} 
	    catch (Exception e) { 
	    	System.out.println(e.getMessage());
	    }
  String s = new String(sb);
  System.out.println(s); 
	}
 } 