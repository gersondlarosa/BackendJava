package com.launchx.practicamona;

class OctoCat4{

    void describe(){

        System.out.println("El es malo");
        System.out.println("Este octo cat vende cosas ilicitas");
        System.out.println("Su producto es cristal");
        System.out.println("Es un octocat terrestre");
    }


}

class Heisencat2 extends OctoCat4{
    void describe2(){
        System.out.println("Esta es su secripción");
    }
}


class Heisencat extends OctaCat{

    void caracteristicas(){
        System.out.println("Esta pelon");
        System.out.println("Tiene lentes");
        System.out.println("Sostiene una brocha");
        System.out.println("Tiene barba");
        System.out.println("Cuenta con un oberon amarillo");

    }
}


public class Heisencatmain {

    public static void main(String[] args) {
        //Clases anonimas
        OctaCat  heisen;
        heisen = new OctaCat();
        heisen.describeOctoCat();
        new Heisencat().caracteristicas();
        new Heisencat2().describe2();
        new Heisencat2().describe();

    }
}
