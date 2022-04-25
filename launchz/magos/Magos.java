package com.launchz.magos;

public class Magos {

    public static void main(String[] args) {
        describeHarry();
        describeDombledore();
        describeNewton();
        describeLuna();
        describeHermione();
    }

    public static void describeHarry(){

        Harry harry = new Harry();

        harry.setCasaPertenese("Gryffindor");
        harry.setGenero("Masculino");
        harry.setNombre("Harry Potter");
        harry.setBoggart("Dementor ");
        harry.setPatronus("Ciervo ");
        String msg = "Esta es la información de Harry Potter";
        msg += "\nCasa a la que pertenese:"+harry.getCasaPertenese();
        msg += "\nGenero: "+harry.getGenero();
        msg += "\nNombre: "+harry.getNombre();
        msg += "\nSu Boggart es: "+harry.getBoggart();
        msg += "\nSu Patronus es: "+harry.getPatronus()+"\n";
        System.out.println(msg);


    }

    public static void describeDombledore(){
        AlbusDumbledore dombledor = new AlbusDumbledore();

        dombledor.setCasaPertenese("Gryffindor");
        dombledor.setGenero("Masculino");
        dombledor.setNombre("Albus Dumbledore");
        dombledor.setBoggart("El cuerpo de su hermana Ariana");
        dombledor.setPatronus("Fénix");
        String msg = "Esta es la información de Albus Dumbledore";
        msg +="\nCasa a la que pertenese: "+dombledor.getCasaPertenese();
        msg +="\nGenero: "+dombledor.getGenero();
        msg +="\nNombre: "+dombledor.getNombre();
        msg += "\nSe Boggart es : "+dombledor.getBoggart();
        msg += "\nSu Patronus es :"+dombledor.getPatronus()+"\n";
        System.out.println(msg);
    }

    public  static void describeNewton(){
        NewtonScamander scamander = new NewtonScamander();

        scamander.setCasaPertenese("Hufflepuff");
        scamander.setGenero("Masculino");
        scamander.setNombre("Newton Scamander");
        scamander.setBoggart("Sin informacion");
        scamander.setPatronus("Sin informacion");
        String msg = "Esta es la información de Albus Dumbledore";
        msg +="\nCasa a la que pertenese: "+scamander.getCasaPertenese();
        msg +="\nGenero: "+scamander.getGenero();
        msg +="\nNombre: "+scamander.getNombre();
        msg +="\nSe Boggart es:"+scamander.getBoggart();
        msg +="\nSu Patronus es: "+scamander.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void describeLuna(){
        Luna luna = new Luna();

        luna.setCasaPertenese("Ravenclaw");
        luna.setGenero("Femenino");
        luna.setNombre("Luna Lovegood");
        luna.setBoggart("N/A");
        luna.setPatronus("Liebre");
        String msg = "Esta es la informacion de Luna Lovegood";
        msg += "\nCasa a la que pertenese:"+luna.getCasaPertenese();
        msg += "\nGenero: "+luna.getGenero();
        msg += "\nNombre: "+luna.getNombre();
        msg += "\nSu Boggart es: "+luna.getBoggart();
        msg += "\nSu Patronus es: "+luna.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void describeHermione(){
        Hermione hermione = new Hermione();
        hermione.setCasaPertenese("\nGryffindor");
        hermione.setGenero("\nFemenino");
        hermione.setNombre("\nHermione Jean Granger");
        hermione.setBoggart("\nLa profesora McGonagall diciéndole que reprobó todo");
        hermione.setPatronus("\nNutria");
        String msg = "Esta es la informacion Hermione Granger";
        msg +="Casa a la que pertenese:"+hermione.getCasaPertenese();
        msg +="Genero"+hermione.getGenero();
        msg +="Nombre"+hermione.getNombre();
        msg +="Su Boggart es"+hermione.getBoggart();
        msg +="Su Patronus es"+hermione.getPatronus();
        System.out.println(msg);
    }
}
