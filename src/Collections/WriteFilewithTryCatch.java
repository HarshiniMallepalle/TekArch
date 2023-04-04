package Collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilewithTryCatch {

	public static void main(String[] args) throws IOException {
	
		String path = "C:\\Users\\harsh\\HarshiniJava\\WriteFile.txt.txt";
		 BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter(path);
			 bw = new BufferedWriter(fw);
		bw.write("Welocome to java Classes written through Eclipse");
		bw.write("\nMy Name is Harshini");
		bw.write("\nSeenium is easy");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			bw.close();
		}
		

	}

}
