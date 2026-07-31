import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "resources/hello_unicode.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException fn) {
            System.out.println("Could not locate file");
        }
        catch (IOException io) {
            System.out.println("Something went wrong");
        }
    }
}