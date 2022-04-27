import java.util.SortedMap;
import java.util.TreeMap;

public class Leer {

    public static void main(String[] args) throws InterruptedException{
            TestKimetsunoYaiba();
    }

    public static void TestKimetsunoYaiba(){
        Screen screen = new Screen();
        KimetsunoYaiba kime = new KimetsunoYaiba(
                01 ,
                 103 ,
                " Yorichi Zeroshiki ",
                " Kimetsu no Yaiba #103: Yorichi Zeroshiki "+"\n"
        );

    Runnable ver = new Runnable() {
        @Override
        public void run() {
            try {
                kime.portada(screen);
                Thread.sleep(3000);
                kime.pag2(screen);
                Thread.sleep(3000);
                kime.pag3(screen);
                Thread.sleep(3000);
                kime.pag4(screen);
                Thread.sleep(3000);
                kime.pag5(screen);
                Thread.sleep(3000);
                kime.pag6(screen);
                Thread.sleep(3000);
                kime.pag7(screen);
                Thread.sleep(3000);
                kime.pag8(screen);
                Thread.sleep(3000);
                kime.pag9(screen);
                Thread.sleep(3000);
                kime.pag10(screen);
                Thread.sleep(3000);
                kime.pag11(screen);
                Thread.sleep(3000);
                kime.pag12(screen);
                Thread.sleep(3000);
                kime.pag13(screen);
                Thread.sleep(3000);
                kime.pag14(screen);
                Thread.sleep(3000);
                kime.pag15(screen);
                Thread.sleep(3000);
                kime.pag16(screen);
                Thread.sleep(3000);
                kime.pag17(screen);
                Thread.sleep(3000);
                kime.pag18(screen);
                Thread.sleep(3000);
                kime.pag19(screen);
                Thread.sleep(3000);
                kime.pag20(screen);
                Thread.sleep(3000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    };
        Thread verManga = new Thread(ver);
        verManga.start();
    }
}
