public class Manga {

    public int id;
    public int tomo;
    public String titulo;
    public String descripcion;

    public Manga(int id, int tomo, String titulo, String descripcion){
        this.id = id;
        this.tomo = tomo;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getId(){return  id;}
    public int getTomo(){return  tomo;}
    public String getTitulo(){return  titulo;}
    public String getDescripcion(){return  descripcion;}

    public boolean setId(int id){
        if (id >0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setTomo(int tomo){
        if (tomo > 0){
            this.tomo = tomo;
            return true;
        }else
            return false;
    }

    public boolean setTitulo(String titulo){
        if (!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }else
            return false;
    }

    public boolean setDescripcion(String descripcion){
        if (!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Id: "+id+
                "Tomo: "+tomo+
                "Titulo: "+titulo+
                "Descripcion:"+descripcion;

    }
}
