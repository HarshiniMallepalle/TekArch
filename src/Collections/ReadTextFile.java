package Collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		//Define file path
		String path = "C:\\Users\\harsh\\HarshiniJava\\ReadFile.txt.txt";
		
		//Read the file
		FileReader ofr = new FileReader(path);
		
		//Read the file line by line
		BufferedReader obr = new BufferedReader(ofr);
		
//		System.out.println(obr.readLine());//Prints and removes the line
//		System.out.println(obr.readLine());
//		System.out.println(obr.readLine());
//		System.out.println(obr.readLine());
//		System.out.println(obr.readLine());

		String str;
		
		while((str=obr.readLine())!=null) {
			System.out.println(str);
		}
		
		obr.close();
	}

}
