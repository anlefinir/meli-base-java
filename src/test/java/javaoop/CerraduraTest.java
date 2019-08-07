package javaoop;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class CerraduraTest {
    @Test
    public void crearCerradura(){
        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClave(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClaveNumericaYLoGuarde(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1234);
    }

    @Test
    public void crearCerraduraConOtraClaveNumericaYLoGuarde(){
        Cerradura cerradura = new Cerradura(1235);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1235);
    }
    //metodos publicos que sean void y no reciban parametors. junit
    @Test
    public void unaCerraduraSeCreaCerrada(){
        //Cree una cerradura
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

    }

    @Test
    public void abrirCerraduraConClave(){
        //Cree una cerradura
        Cerradura cerradura = new Cerradura(1234);
        //Vea que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        //La intento abrir
        cerradura.abrir(1234);
        //Veo que no esta cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isFalse();
    }
}
