package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {



	@Test
	void test() {
		Coche coche = new Coche();
		double valorDevuelto = coche.setMotor();
		
		if(valorDevuelto < 40/7 & valorDevuelto >20/7) {
			assertTrue(true);
		}else {
			assertFalse(false);
		}
	}

}
