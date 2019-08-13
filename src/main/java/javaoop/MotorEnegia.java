package javaoop;

import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class MotorEnegia extends Motor {


    public void recibirRefrigerante(Refrigerante refrigerante){
        int x = (int) Math.round(refrigerante.intensidad * 0.2);
        temperatura -= x;
    }

    //Supplier<List<String>> listSupply = ArrayList<String>::new;
    //Supplier<List<Cerradura>> listSupply2 = ArrayList<Cerradura>::;
}
