import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreaterFile {

    public void createFile(final String filename, final long sizeInBytes) throws IOException {
        File file = new File(filename);
        file.createNewFile();

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.setLength(sizeInBytes);
        raf.close();

    }
    public void crateFile10(final String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.setLength(10485760);
        raf.close();
    }
}
