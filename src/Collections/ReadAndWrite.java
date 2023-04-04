package Collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {

		// Define file path
		String path = "C:\\Users\\harsh\\HarshiniJava\\ReadFile.txt.txt";

		// Read the file
		FileReader ofr = new FileReader(path);

		// Read the file line by line
		BufferedReader obr = new BufferedReader(ofr);

		//System.out.println(obr.readLine());//Prints and removes the line
		//System.out.println(obr.readLine());

		String path1 = "C:\\Users\\harsh\\HarshiniJava\\NewWrite.txt.txt";
		BufferedWriter bw = null;
		FileWriter fw = new FileWriter(path1);

		bw = new BufferedWriter(fw);

		String str;
		while ((str = obr.readLine()) != null) {
			
			bw.write(str);
			bw.write("\n");
			
		

		}
		bw.close();
		obr.close();
	}
}
