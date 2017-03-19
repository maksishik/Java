import fileWork.ByteTo;
import fileWork.fileClass.MyFileClass;
import fileWork.fileIOClass.MyIOClass;
import fileWork.fileWRClass.MyFileWRClass;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\Other\\JAVA prjs\\Java-PHP\\src\\1.txt");
        File dir = new File("D:\\Other\\Универ");
        boolean isWriteInFile = false;

        List<String> a = MyFileClass.getDirInfo(dir, isWriteInFile);

        System.out.println("\nDirectory size = " + ByteTo.toMB(MyFileClass.dirSize));
        System.out.println("Total files = " + MyFileClass.coutFiles);

        if(isWriteInFile) {
            String text = "";

            for (String i : a) {
                text += i + "\n";
            }

            MyFileWRClass.fileWrite(file, text);
        }
    }
}
