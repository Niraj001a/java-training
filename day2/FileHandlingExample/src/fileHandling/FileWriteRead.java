package fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteRead {
	

	
		public static void main(String[] args) {
			try {
				FileWriter myWriter = new FileWriter("C:\\Core java\\File Handling\\MyFile.txt");
				myWriter.write("Data to write into file");

				myWriter.close();
				System.out.println("Successfully wrote to the file.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				File myObj = new File("C:\\Core java\\File Handling\\MyFile.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");

			}

	 
				}
}
