/**
 * 
 */
package dto;

import view.Vista;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Calculo {
	private double resultado;
	private Vista vista;

	public Calculo() {
		this.resultado = 0;
		this.vista = new Vista();
	}

	public void sumar(double x, double y) {
		this.resultado = x + y;
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void restar(double x, double y) {
		this.resultado = x - y;
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void multiplicar(double x, double y) {
		this.resultado = x * y;
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void potencia(double x, double y) {
		this.resultado = Math.pow(x, y);
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void raizCuadrada(double x) {
		this.resultado = Math.sqrt(x);
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void raizCubica(double x) {
		this.resultado = Math.pow(x, 3);
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

	public void dividir(double x, double y) {
		this.resultado = x / y;
		vista.mostrarResultado("Resultado: " + this.resultado);
	}

}
