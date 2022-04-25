package com.launchx.practicamona;

class Octocat2{
    String colorTabal = "rosa";

    void surft(){
        System.out.println("Este Ocatca cat es un surfer");
        System.out.println("Y su tabla es de color "+colorTabal);
    }
}

class surfOctocat extends OctaCat{
    void juega(){
        System.out.println("Se encuentra jugando en el agüa");
    }
}

class surftOctocatdos extends Octocat2{
    void divierte(){
        System.out.println("Se divierte");
    }
}


public class Surftocat {

    public static void main(String[] args) {
        new surfOctocat().describeOctoCat();
        new surftOctocatdos().surft();
    }

}
