package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
	
	File obj = new File("C:\\Core java\\File Handling\\MyFile.txt");
	
	try {
//		------1st code------
//		if(obj.createNewFile()) {
//			System.out.println("File Ctreated: "+obj.getName());
//		}
//		else {
//			System.out.println("File Already exist");
//		}
		
//		-----2nd code-----
		if(obj.exists()) {
			System.out.println("File name: "+obj.getName());
			System.out.println("Absolute path: "+obj.getAbsolutePath());
			System.out.println("Writeable : "+obj.canWrite());
			System.out.println("Readable  : "+obj.canRead());
			System.out.println("File size in bytes: "+obj.length());
		}
		else {
			System.out.println("File Already exist");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
}

}
