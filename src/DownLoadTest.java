import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownLoadTest {
    public static void main(String[] args) throws IOException {
        DownLoadTest downLoadTest =new DownLoadTest();
        long start1m = System.currentTimeMillis();
        downLoadTest.down1mb();
        long finish1m = System.currentTimeMillis();
        long elapsed1m = finish1m - start1m;
        downLoadTest.print1(elapsed1m);

        long start10m = System.currentTimeMillis();
        downLoadTest.down10mb();
        long finish10m = System.currentTimeMillis();
        long elapsed10m = finish10m - start10m;
        downLoadTest.print10(elapsed10m);


    }
    public void down10mb() throws IOException {
        URL website = new URL("https://gemorr.online/test10");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("information.html");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
    public void down1mb() throws IOException {
        URL website = new URL("https://gemorr.online/TGv97zVdw8kxG9iT8fuo");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("information.html");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
    public void print1(long time ){
        System.out.println("Ушло время на загрузку пакета 1 мегабайт "+time);
        System.out.println(Mega.MEGA1.mega/time/100+ "Mbs test 1 mb");
        System.out.println(Mega.MEGA1.mega/time +" Kbs test 1mb" );
        System.out.println(Mega.MEGA1.mega/time*1000+" bs test 1mb");
    }
    public void print10(long time ){
        System.out.println("Ушло время на загрузку пакета 10 мегабайт "+time);
        System.out.println(Mega.MEGA10.mega/time/100+ "Mbs test 10 mb");
        System.out.println(Mega.MEGA10.mega/time +" Kbs test 10mb" );
        System.out.println(Mega.MEGA10.mega/time*1000+" bs test 10mb");
    }

}
enum Mega{
    MEGA1(1048576),
    MEGA10(10485760);
    public final long mega;
    Mega(int mega){
        this.mega = mega;
    }


}
