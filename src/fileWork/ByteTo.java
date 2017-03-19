package fileWork;

/**
 * Created by Maksim on 17.03.2017.
 */
public class ByteTo {
    private static final int BYTE_IN_KILOBYTE = 1024;
    private static final int BYTE_IN_MEGABYTE = (1024*1024);

    public static float toKB(float size) {
        return ((float)(size / BYTE_IN_KILOBYTE));
    }

        public static float toMB(float size) {
        return ((float)(size / BYTE_IN_MEGABYTE));
    }
}
