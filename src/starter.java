import java.io.IOException;

public class starter {
    public static void main(String[] args) throws IOException {
//CreaterFile createrFile = new CreaterFile();
//createrFile.createFile("test.txt",1048576);
        //CreaterFile createrFile10 = new CreaterFile();
        //createrFile10.crateFile10("test10");
        DownLoader downLoader = new DownLoader();
        long start = System.currentTimeMillis();
        downLoader.down();
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло время - мс : " + elapsed);
        long megaaBait = 10485760 ;//v bitah
        System.out.println(megaaBait/elapsed +" Kbs" );
        System.out.println(megaaBait/elapsed*1000+" bs");
    }
}
