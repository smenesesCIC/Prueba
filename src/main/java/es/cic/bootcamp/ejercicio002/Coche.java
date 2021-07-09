package es.cic.bootcamp.ejercicio002;

public class Coche {
	
	private Motor motor = new Motor();
	
	public double setMotor() {
		int potencia = (int) Math.round(Math.random()*20+20);
		motor.setPotencia(potencia);
		double valorDevuelto = motor.getPotencia()/7;
		
		return valorDevuelto;
		
	}
}
