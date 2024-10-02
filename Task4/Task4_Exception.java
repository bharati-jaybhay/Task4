package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_Exception {

    public static void main(String[] args) {
       
        String filePath = "C:\\Users\\bharati jaybhay\\Desktop\\corejava1\\Internship\\src\\main\\java\\Task4\\example.txt";
       
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Reading file content:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } 
        catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Finished reading the file.");
        }
    }
}
