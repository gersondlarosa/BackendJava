package com.launchz.magos;

public class Harry {

    public String casaPertenese, genero, nombre, boggart, patronus;

    public String getCasaPertenese(){ return casaPertenese;}
    public String getGenero(){return genero;}
    public String getNombre(){return nombre;}
    public String getBoggart(){return boggart;}
    public String getPatronus(){return patronus;}

    public boolean setCasaPertenese(String casaPertenese){
        if (!casaPertenese.isEmpty()){
            this.casaPertenese = casaPertenese;
            return true;
        }else
        return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

}
