package com.launchx.practicamona;

class Octocat5{

    void describe (){
        System.out.println("Encontraste un Octocat que protege a la humanidad");
        System.out.println("Igual que su contra parte Megaman protege a la humanidad ");

    }
}



class MegaCat extends OctaCat{
    String armadura = "Azul";

    void posturas(){
        System.out.println("Este Octocat se necuntra en combate");
        System.out.println("Cuetna con un blaster");
        System.out.println("Cienta con una armadura de color "+ armadura);
    }

}

class Megacat2 extends Octocat5{

  void descrbe2(){
      System.out.println("Esto es una descripcion ");
  }

}


public class MegacatV2Main {

    public static void main(String[] args) {
        OctaCat megaman;
        megaman = new OctaCat();
        megaman.describeOctoCat();
        new MegaCat().posturas();
        new Megacat2().descrbe2();
        new Megacat2().describe();


    }
}
