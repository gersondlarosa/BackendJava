package com.launchx.practicamona;

class Octocat3{
    String equipo = "Equipo de buceo";

    void bucear(){
        System.out.println("Scubatocat se encuentra buseando y cuenta con"+ equipo);
        System.out.println("Se encuenta con un pes globo");
    }
}


class ScubaOctocat extends OctaCat{

    void jugar(){
        System.out.println("Esta buceando");
    }

    void buceandos(){
        System.out.println("Scubatocat se encuentra buseando y cuenta con el tanque y visores correspondiente");
        System.out.println("Se encuenta con un pes globo");
    }


}



public class Scubatocat {
    public static void main(String[] args) {
        new ScubaOctocat().jugar();
        new ScubaOctocat().buceandos();
        OctaCat scuba;
        scuba = new OctaCat();
        scuba.describeOctoCat();
    }
}
