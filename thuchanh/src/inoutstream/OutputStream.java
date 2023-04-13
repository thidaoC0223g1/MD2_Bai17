package inoutstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./thuchanh/txt/testoutput.txt");
        file.createNewFile();
        FileOutputStream outputfile = new FileOutputStream(file);
        byte[] bytes = new byte[]{'h', 'e', 'l', 'l','o', ' ', 'e', 'v', 'e', 'r', 'y', 'o', 'n', 'e'};
        for (byte i : bytes) {
            outputfile.write(i);
        }outputfile.close();
    }

}
