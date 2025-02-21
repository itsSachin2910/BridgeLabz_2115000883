import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

