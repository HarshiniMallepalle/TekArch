package Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PropertiesFilesConcept {

	public static void main(String[] args) throws IOException {
		//1. Define the path of the file to be read.
		String path="C:\\Users\\harsh\\HarshiniJava\\Application.properties.txt";
		
		//2 . Load the file to Object . Type of the Object is File Input Stream
        FileInputStream fileinput = new FileInputStream(path);
        
        //3. Create an Object of Properties Class
        Properties property = new Properties();
        
        //4. Load  fileinput stream to the properties
        property.load(fileinput);
        
        //5. Retrieve the data from the file. 
       // System.out.println(property.get("url"));
        
        //6.To write data to the file input stream
        FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\harsh\\HarshiniJava\\Application.properties.txt",true);
       // String s = "\nemail=mhr@gmail.com";
       String s="\ntext=My name is Harshini\nkids=I have 2 kids\nplace=I live in CliftonPark";//to write more lines
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++) {
        	fileoutput.write(ch[i]);
        }
            	
		for(Map.Entry value:property.entrySet()) {
		System.out.println(value.getKey()+ "        "+value.getValue());
	}
	fileoutput.close();	
	}

}        //property.store(fileoutput,"java");//we can data like this also.


        
//		property.put("email","m.harshini.reddy@gmail.com");
//		property.put("Phone",1234567890);
//		property.put("Pincode",12065);
//		property.put('H',"Harshini");
//		property.put(69.98,59.89);
//		property.put(33, 'A');
//		property.put(33, 'Z');
		
		//No duplicate key it replaces latest value
		//Duplicate Value is allowed
		//No assertion order
		//No Null Key
		//No Null Value
		//property.put(null,"Java");
		//property.put(980.69,null);
		
	