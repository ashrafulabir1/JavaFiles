package JavaFiles;

import java.io.*;  

public class JavaFiles {  
    public static void main(String[] args) {  
  
        try {  
        	//creating a dile
            File file = new File("javaFile.txt");  
                 file.createNewFile();
                 
                 //Read files directory
                 File dir=new File("C:\\Users\\USER\\eclipse-workspace\\JavaFiles");  
                 File files[]=dir.listFiles();  
                 String filenames[]=dir.list();  
                 for(String filename:filenames) {  
                     System.out.println(filename);
                 }
                 //create and write in files true = append mode on so we can rewrite in existing file
                 FileWriter writer = new FileWriter("JavaFileNew.txt",true);
                 writer.write("Hello World 2");
                 writer.close();
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  