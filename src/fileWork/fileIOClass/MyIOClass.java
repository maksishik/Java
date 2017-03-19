package fileWork.fileIOClass;

import java.io.*;

/**
 * Created by Maksim on 17.03.2017.
 */
public class MyIOClass {
    private static FileInputStream fin = null;
    private static FileOutputStream fos = null;

    public static void readFile(File path) {
        try {
            fin = new FileInputStream(path);

            int sym = 0;
            System.out.println("File`s content:");
            while ((sym = fin.read()) != -1) {
                System.out.print((char)sym);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeFile(File path, String text) {
        try {
            fos = new FileOutputStream(path);

            byte[] buffer = text.getBytes();
            fos.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeFromOneToOther(File from, File to) {
        try {
            fin = new FileInputStream(from);
            fos = new FileOutputStream(to);

            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            fos.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fin.close();
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
