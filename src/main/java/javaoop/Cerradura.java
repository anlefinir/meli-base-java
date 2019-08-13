package javaoop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

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

    //Factory, Builder.
    //Predicate<Persona> criterioDeBusqueda = persona -> persona.esHombre();
    //Supplier<T>;

    // Como se crea una insta de listSupplier, es un Factory.
    //Supplier<List<String>> listSupply = ArrayList<String>::new;//Como se hacen las cosas, no las cosas
    // Espera instrucciones en forma de lambda

    //List<String> lista = listSupply.get();//llama al constructor cuando llamas al get.

    //Consumer-Consume metodos de un parámetro.
    //Consumer<Integer> logNumero = numero -> System.out.println(numero);
    //Function and BiFunction
    //Utilazada para convertir un valor a otro.
    //De, A
    //Function<Integer, List> listSupplier = num -> new ArrayList(num);
    //List lista = listSupplier.apply(5);

    //StreamAPI.
    //Es de a uno, pensar en Bureau.

    //Para hacer un toList, tengo que utilizar un Collect.
    //permite usar parallels. Si hay hardware que soporta paralelismo, seria más rápido.

    //Collect


}
