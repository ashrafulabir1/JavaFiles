package JavaFiles;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class WriteFile {
public static void main(String[] args)
        throws IOException
    {
	 String text= "Welcome";

 // Defining the file name of the file
 Path fileName = Path.of("C:/Users/USER/eclipse-workspace/JavaFiles/JavaFileNew.txt");

 // Writing into the file
 Files.writeString(fileName, text);

 // Reading the content of the file
 String file_content = Files.readString(fileName);

 // Printing the content inside the file
 System.out.println(file_content);
 
}
}