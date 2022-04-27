import java.awt.*;

public class KimetsunoYaiba extends  Manga implements Paginas{
    public KimetsunoYaiba(int id, int tomo, String titulo, String descripcion){
        super(id,tomo, titulo, descripcion);
    }


    @Override
    public void portada(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("portada.png");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag2(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("002.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void pag3(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("003.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag4(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("004.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag5(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("005.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag6(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("006.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag7(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("007.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag8(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("008.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag9(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("009.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag10(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("010.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag11(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("011.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag12(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("012.jpg");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void pag13(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("013.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag14(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("014.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag15(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("015.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag16(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("016.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag17(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("017.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag18(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("018.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag19(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("019.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void pag20(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Color.RED);
        s.showImage("020.jpg");
        s.setBounds(200,100,1100,900);
    }


}
