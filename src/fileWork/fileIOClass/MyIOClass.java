package fileWork.fileIOClass;

import fileWork.ByteTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Maksim on 17.03.2017.
 */
public class MyIOClass {
    private static FileInputStream fileInputStream = null;

    public static void writeFile(File path) {
        try {
            fileInputStream = new FileInputStream(path);

            int fileSize = fileInputStream.available();
            System.out.println("SizeOf = " + ByteTo.toKB(fileSize) + " bite");

            int sym = 0;
            System.out.println("File`s content:");
            while ((sym = fileInputStream.read()) != -1) {
                System.out.print((char)sym);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
