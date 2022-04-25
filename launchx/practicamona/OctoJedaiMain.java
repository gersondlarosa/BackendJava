package com.launchx.practicamona;

class OctoCat6{

    void define(){
        System.out.println("Este Ocotcad es elegido por la fuerza ");
        System.out.println("Exceleten maestro en las arte Jedi");
    }
}


class OctobiWanCatnobi extends OctaCat{

    void vestimenta(){
        System.out.println("Viste con manto cafe");
        System.out.println("Botas");
        System.out.println("Pantalones y camisa marron");
        System.out.println("Cinturon");
    }

    void define(){
        System.out.println("Cuenta con la fuerza");
        System.out.println("Pertenece a un consejo Jedi");
    }
}

class Octobi extends OctoCat6{
    void definedos(){
        System.out.println("Que la abstracción este contigo");
    }
}

public class OctoJedaiMain {

    public static void main(String[] args) {

        OctaCat jedi;
        jedi = new OctaCat();
        jedi.describeOctoCat();
        new Octobi().definedos();
        new OctobiWanCatnobi().vestimenta();
        new OctobiWanCatnobi().define();
        new Octobi().define();

    }
}
