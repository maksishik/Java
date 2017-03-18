import fileWork.fileClass.MyFileClass;
import fileWork.fileIOClass.MyIOClass;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        //String srt = "Test write";
        File file = new File("D:\\Java projects\\Test\\src");
        if (file.isDirectory())
            System.out.println("This is Directory");
        else
            System.out.println("This is File");

        MyIOClass.writeFile(file);
        //MyFileClass.fileRead(file);

        //fileWork.fileClass.MyFileClass.fileWrite(file, srt);
    }
}
