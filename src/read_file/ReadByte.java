package read_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class ReadByte {
    // char readOneByte(String filename)
    // 지정한 파일의 맨 앞 한byte를 읽어오는 method를 만들어보세요

    public char read1char(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        // 왜 두 번 쓰는거지?
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }



    public static void main(String[] args) throws IOException {
        /*FileReader reader = new FileReader("./Hello.txt");
        char c = (char) reader.read();
        System.out.println(c);*/

        File dir = new File("read_file/Hello");
        // listFiles() : 디렉토리 경로에 있는 파일들을 필터링. 그 결과를 배열로 리턴
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
/*Exception in thread "main" java.lang.NullPointerException
	at read_file.ReadByte.main(ReadByte.java:17)*/