package javaoop;

public class Cerradura {
    public Integer clave = 1234;
    private boolean cerrada = true;

    public Cerradura(){
    };

    public Cerradura (Integer clave){
        this.clave = clave;
    };

    public boolean estaCerrada(){
        return cerrada;
    }

    public void abrir(Integer clave){
        if(clave.equals(this.clave)){
            this.cerrada = false;
        }
    }
}
