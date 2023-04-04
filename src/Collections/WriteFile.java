package Collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
  String path = "C:\\Users\\harsh\\HarshiniJava\\Write.txt.txt";
  
  FileWriter fw = new FileWriter(path);
  
  BufferedWriter bw = new BufferedWriter(fw);
  
  bw.write("Writing without try catch");
  bw.write("\nSelenium");
  bw.write("\nWe need to add Jar files");
  bw.write("\nHarshini");

	bw.close();
		
	}

}
