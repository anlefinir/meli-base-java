package javaoop;

public class MotorEnegia extends Motor {

    public void recibirRefrigerante(Refrigerante refrigerante){
        int x = (int) Math.round(refrigerante.intensidad * 0.2);
        temperatura -= x;
    }
}
