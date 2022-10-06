package read_file;

import java.io.File;
import java.io.IOException;

public class ReadByte {
    // char readOneByte(String filename)
    // 지정한 파일의 맨 앞 한byte를 읽어오는 method를 만들어보세요

    public static void main(String[] args) throws IOException {
        /*FileReader reader = new FileReader("./Hello.txt");
        char c = (char) reader.read();
        System.out.println(c);*/

        File dir = new File("read_file/Hello");
        File files[] = dir.listFiles();
        System.out.println(files[0]);
    }
}
/*Exception in thread "main" java.lang.NullPointerException
	at read_file.ReadByte.main(ReadByte.java:17)*/