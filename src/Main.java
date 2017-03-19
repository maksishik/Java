import fileWork.fileIOClass.MyIOClass;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        //String srt = "Test write";
        File file = new File("D:\\Other\\JAVA prjs\\Java-PHP\\src\\1.txt");
        File file2 = new File("D:\\Other\\JAVA prjs\\Java-PHP\\src\\2.txt");

        MyIOClass.writeFromOneToOther(file, file2);
        //MyFileClass.fileRead(file);

        //fileWork.fileWRClass.MyFileClass.fileWrite(file, srt);
    }
}
