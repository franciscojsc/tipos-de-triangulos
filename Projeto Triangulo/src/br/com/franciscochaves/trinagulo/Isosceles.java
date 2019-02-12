package br.com.franciscochaves.trinagulo;

public class Isosceles extends Triangulo {

	/*
	 * Triângulo isósceles Definição: Dois de seus lados têm a mesma medida
	 */

	// Poderão ser nomeado
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public double getArea() {
		return calcularArea();
	}

	@Override
	double calcularArea() {
		double area = 0;

		if (getLadoA() == getLadoB()) {
			area = (getLadoC() * Math.sqrt((getLadoA() * getLadoB())
					- ((getLadoC() * getLadoC()) / 4))) / 2;
		} else if (getLadoB() == getLadoC()) {
			area = (getLadoA() * Math.sqrt((getLadoB() * getLadoC())
					- ((getLadoA() * getLadoA()) / 4))) / 2;
		} else if (getLadoC() == getLadoA()) {
			area = (getLadoB() * Math.sqrt((getLadoC() * getLadoA())
					- ((getLadoB() * getLadoB()) / 4))) / 2;
		}

		return area;
	}

}
