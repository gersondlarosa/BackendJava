package com.launchx.practicamona;

class OctaCat{
    String color = "negro";
    String colorPiel = "rosa";

    //Caso 2
   void describeOctoCat(){
       System.out.println("Haz encontrado un Octacat"+" Es de color: "+color+" su cara es de color: "+colorPiel);
   }

    OctaCat(){
       System.out.println("Haz encontrado un Octacat");
   }


}

class  NUXtocat extends OctaCat{

    //Caso 1


    void juega(){
        System.out.println("Se enceuntra parado en una roca");
        System.out.println("Sostiene dos controles");
        System.out.println("Observa una maripoza galactica de color verde fluoresente");
    }

   void encontrar2(){

        System.out.println("Se a encontrado un Octacat esta Jugando");
    }

    void call(){
        super.describeOctoCat();
        juega();
    }

    //Caso 3
    NUXtocat(){
        super();
        System.out.println("Es como un gato pulpo");
    }

}

public class Practicamona {

    public static void main(String[] args) {

        //Caso 1
        //new NUXtocat().encontrar();

        //Caso 2
       //new NUXtocat().encontrar2();
       // new NUXtocat().call();

        //Caso3
        new NUXtocat();
    }

}
