package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		int potencia = 25;
		Motor motor = new Motor();
		
		motor.setPotencia(potencia);
		
		int potenciaReal = motor.getPotencia();
		
		assertEquals(25,potenciaReal);
	}

}
