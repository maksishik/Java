package fileWork.fileClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim on 19.03.2017.
 */
public class MyFileClass {
    public static long dirSize = 0;
    public static int coutFiles = 0;
    private static List<String> info = new ArrayList<>();

    public static List<String> getDirInfo(File dir, boolean isWriteInFile) {
        System.out.println("\n->Directory name = " + dir.getPath());
        for (File item : dir.listFiles()) {
            if( item.isDirectory() ) {
                getDirInfo(item.getAbsoluteFile(), isWriteInFile);
                /*
                System.out.print("DIR LENGHT = " + item.length());
                System.out.println(" This is dir, nmae = " + item.getName());*/
            }
            else {
                coutFiles++;
                dirSize += item.length();
                System.out.print("File size = " + item.length());
                System.out.println("\t\t | File name = " + item.getName());

                if(isWriteInFile)
                    info.add("path = " + dir.getPath() + " | size = " + Long.toString(item.length()) + " | name = " + item.getName());
            }
        }

        if(isWriteInFile)
            return info;
        else
            return null;
    }
}
