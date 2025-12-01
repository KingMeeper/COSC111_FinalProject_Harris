
import java.io.*;
import java.util.Scanner;

public class CountDemo {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("input.txt");
            Scanner reader = new Scanner(file);

            int lineCount = 0;
            int wordCount = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;
                wordCount += line.split("\\s+").length;  // Why use split("\\s+")? What if there are blank lines?
            }
            PrintWriter writer = new PrintWriter("output.txt");
            writer.println("Lines: " + lineCount);
            writer.println("Words: " + wordCount);
            writer.close();
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
