package model;

public class Divisao {

	private double numero1;
	private double numero2;
	
	public Divisao()
	{
		
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	

	public String toString(double numero1,double numero2)
	{	
		double resultado = 0;
		resultado = numero1 / numero2;
		
		return Double.toString(resultado);
		
	}
	
}
