package javaoop;

public class Motor {
    Integer temperatura;
    Integer potencia;

    public Motor() {
        this.potencia = 0;
        this.temperatura = 0;
    }

    public void aumentarPotencia(Integer aumento){
        temperatura += (aumento / 4);
    }

    public void bajarPotencia(Integer decremento){
        temperatura -= (decremento / 4);
    }
}
