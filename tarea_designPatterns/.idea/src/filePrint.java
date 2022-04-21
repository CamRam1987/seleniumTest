import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filePrint{
    public static void fileWriter(String textoCifrado){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("mensajeCifrado.txt"));
        bw.write(textoCifrado+"\n");
        bw.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException ex) {
        return;
    }
    }
}
