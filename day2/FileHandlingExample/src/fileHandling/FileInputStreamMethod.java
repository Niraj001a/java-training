package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMethod {
	  
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Core java\\File Handling\\MyFile.txt");


		int k;
		while((k=fis.read())!=-1) {
			System.out.println("  "+k);
		}
	}

}
