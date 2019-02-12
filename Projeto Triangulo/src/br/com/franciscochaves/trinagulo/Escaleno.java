package br.com.franciscochaves.trinagulo;

public class Escaleno extends Triangulo {

	/*
	 * Triângulo escaleno Definição: Os três lados possuem medidas diferentes
	 */

	// Poderão ter sua cor escolhida
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public double getArea() {
		return calcularArea();
	}

	@Override
	double calcularArea() {
		double area = 0;
		double s = (getLadoA() + getLadoB() + getLadoC()) / 2;// semiperimetro

		area = Math.sqrt(s * (s - getLadoA()) * (s - getLadoB())
				* (s - getLadoC()));
		return area;
	}
}
