package br.com.franciscochaves.trinagulo;

public class Equilatero extends Triangulo {

	/*
	 * Triângulo equilátero Definição: Todos os lados possuem a mesma medida
	 */

	@Override
	public double getArea() {
		return calcularArea();

	}

	@Override
	double calcularArea() {
		double area = (((getLadoA() * getLadoA()) * Math.sqrt(3))) / 4;
		return area;
	}

}
