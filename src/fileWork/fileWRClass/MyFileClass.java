package fileWork.fileWRClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Maksim on 17.03.2017.
 */
public class MyFileClass {
    private static FileWriter fw = null;
    private static FileReader fr = null;

    public static void fileWrite(File path, String text) {
        try {
            fw = new FileWriter(path);
            fw.write(text);
            System.out.println("Its okay!!");
        } catch (IOException e) {
            System.out.println("Неу далост найти фаойл " + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("не удалост казрыть файл " + e.getMessage());
            }
        }
    }

    public static void fileRead(File path) {
        try {
            fr = new FileReader(path);

            int sym = 0;
            while ((sym = fr.read()) != -1) {
                System.out.print((char)sym);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
