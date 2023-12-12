package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWordByWord {

	public static void main(String[] args) throws FileNotFoundException {
		
		File myObj = new File("C:\\Core java\\File Handling\\MyFile.txt");
		Scanner myReader = new Scanner(myObj);
		int words=0;
		while (myReader.hasNext()) {
			String word = myReader.next();
			System.out.println(word);
			words++;
		}
		System.out.println("Total number of words "+words);

	

    
	}
}
