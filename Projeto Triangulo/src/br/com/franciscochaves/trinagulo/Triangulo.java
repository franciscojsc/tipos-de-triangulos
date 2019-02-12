package br.com.franciscochaves.trinagulo;

public abstract class Triangulo {

	private int ladoA;
	private int ladoB;
	private int ladoC;
	private double area;

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	public double getArea() {
		return area;
	}

	// cada triangulo será responsavel por saber calcular sua área
	abstract double calcularArea();

}
