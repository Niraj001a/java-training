package streamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class FileApiPrint {

	public static void main(String[] args) throws IOException {
		 File fileName = new File("C:\\Core java\\File Handling\\Apichecker.txt"); 
		  
	        // Create a Stream of string type 
	        // using the lines() method to 
	        // read one line at a time from the text file 
	        Stream<String> text = Files.lines(fileName.toPath()); 
	  
	        
	        text.parallel().forEach(System.out::println);
	       
	        
	        // Creating parallel streams using parallel() method 
	        // later using forEach() to print on console 
//	        text.parallel().forEach(System.out::println); 
	  
	        // Closing the Stream 
	        // using close() method 
	        text.close(); 
	}
}
