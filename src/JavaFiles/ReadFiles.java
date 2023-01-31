package JavaFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("javaFile.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line);
        }
        br.close();
    }
}