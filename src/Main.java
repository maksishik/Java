import fileWork.fileClass.MyFileClass;
import fileWork.fileIOClass.MyIOClass;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        //String srt = "Test write";
        //File file = new File("D:\\Other\\JAVA prjs\\Java-PHP\\src\\1.txt");
        //File file2 = new File("D:\\Other\\JAVA prjs\\Java-PHP\\src\\2.txt");

        File dir = new File("D:\\Other\\JAVA prjs\\Java-PHP");
        MyFileClass.test(dir);
        System.out.println(MyFileClass.dirSize);

        //MyIOClass.writeFromOneToOther(file, file2);
        //MyFileWRClass.fileRead(file);

        //fileWork.fileWRClass.MyFileWRClass.fileWrite(file, srt);
    }
}
