package com.launx.spiderverse;

class Spiderman{

    void habilidades(){
        System.out.println("Trepa muros");
        System.out.println("Supoer fuerza");
        System.out.println("Sentido aragnido");
        System.out.println("Cuenta con telarañas");

    }
}

interface SpiderHam {
    void telaraña();
}

interface SpidermanP{
    void  aventar();
}

interface SpiderUnlimiter{
    void aventarrastreador();
}


public class Spiderverse extends Spiderman implements SpiderHam,SpidermanP {

    public static void main(String[] args) {

        Spiderverse spider = new Spiderverse();

        spider.telaraña();
        spider.aventar();
        spider.aventarrastreador();

        spider.habilidades();

    }

    @Override
    public void telaraña() {
        System.out.println("Ha aventado una telaraña al enemigo");

    }

    public void aventar(){
        System.out.println("Haz aventado al enemigo");
    }

    public void aventarrastreador(){
        System.out.println("Envia rastreador por que se dio a la fuga");
    }
}
