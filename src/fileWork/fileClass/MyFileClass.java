package fileWork.fileClass;

import java.io.File;

/**
 * Created by Maksim on 19.03.2017.
 */
public class MyFileClass {
    public static int dirSize = 0;

    public static void test(File dir) {
        if(dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if( item.isDirectory() ) {
                    test(item.getAbsoluteFile());
                    /*
                    System.out.print("DIR LENGHT = " + item.length());
                    System.out.println(" This is dir, nmae = " + item.getName());*/
                }
                else {
                    dirSize += item.length();
                    System.out.print("FILE LENGHT = " + item.length());
                    System.out.println(" This is file, name = " + item.getName());
                }
            }
        }
    }
}
