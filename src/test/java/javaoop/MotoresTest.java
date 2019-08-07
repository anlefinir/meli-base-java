package javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class MotoresTest {

    Motor motorACombustible;
    Motor motorAEnergiaSolar;
    Motor motorAEnergiaNuclear;

    @Before
    public void setup(){
        motorACombustible = new MotorACombustible();
        motorAEnergiaSolar = new MotorAEnergiaSolar();
        motorAEnergiaNuclear = new MotorAEnergiaNuclear();
    }

    @Test
    public void creacionDeMotorACombustible(){
        Motor motor = new MotorACombustible();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void creacionDeMotorAEnergiaSolar(){
        Motor motor = new MotorAEnergiaSolar();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void creacionDeMotorAEnergiaNuclear(){
        Motor motor = new MotorAEnergiaNuclear();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void verificarPotenciaYTempMotorCreado(){
        Assertions.assertThat(motorACombustible.potencia).isEqualTo(0);
        Assertions.assertThat(motorAEnergiaSolar.potencia).isEqualTo(0);
        Assertions.assertThat(motorAEnergiaNuclear.potencia).isEqualTo(0);
        Assertions.assertThat(motorACombustible.temperatura).isEqualTo(0);
        Assertions.assertThat(motorAEnergiaSolar.temperatura).isEqualTo(0);
        Assertions.assertThat(motorAEnergiaNuclear.temperatura).isEqualTo(0);
    }

    @Test
    public void modificarPotenciaDeberiaModificarTemperatura(){
        motorACombustible.aumentarPotencia(20);
        Assertions.assertThat(motorACombustible.temperatura).isEqualTo(5);
        motorACombustible.bajarPotencia(20);
        Assertions.assertThat(motorACombustible.temperatura).isEqualTo(0);

        motorAEnergiaNuclear.aumentarPotencia(20);
        Assertions.assertThat(motorAEnergiaNuclear.temperatura).isEqualTo(5);
        motorAEnergiaNuclear.bajarPotencia(20);
        Assertions.assertThat(motorAEnergiaNuclear.temperatura).isEqualTo(0);

        motorAEnergiaSolar.aumentarPotencia(20);
        Assertions.assertThat(motorAEnergiaSolar.temperatura).isEqualTo(5);
        motorAEnergiaSolar.bajarPotencia(20);
        Assertions.assertThat(motorAEnergiaSolar.temperatura).isEqualTo(0);
    }

    @Test
    public void modificarPotenciaDeberiaModificarTemperatura2(){
        motorACombustible.aumentarPotencia(20);
        motorACombustible.aumentarPotencia(20);
        Assertions.assertThat(motorACombustible.temperatura).isEqualTo(10);
        motorACombustible.bajarPotencia(20);
        Assertions.assertThat(motorACombustible.temperatura).isEqualTo(5);
    }

    @Test
    public void ponerRefrigeranteAMotorEnergia(){
        MotorEnegia motorEnegia1 = new MotorAEnergiaSolar();
        motorEnegia1.aumentarPotencia(20);
        Refrigerante refrigerante = new Refrigerante(20);
        motorEnegia1.recibirRefrigerante(refrigerante);
        Assertions.assertThat(motorEnegia1.temperatura).isEqualTo(1);
        motorEnegia1.aumentarPotencia(20);
        Assertions.assertThat(motorEnegia1.temperatura).isEqualTo(6);
    }

}
