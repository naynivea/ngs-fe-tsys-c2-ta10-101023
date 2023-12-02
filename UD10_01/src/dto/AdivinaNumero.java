/**
 * 
 */
package dto;

import java.util.Random;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class AdivinaNumero {
	private int numero;
	private int intentos;
	private String mensajeException;

	public AdivinaNumero() {
		this.numero = gerarNumeroAleatorio();
		this.intentos = 1;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public String getMensajeException() {
		return mensajeException;
	}

	private int gerarNumeroAleatorio() {
		Random random = new Random();

		return random.nextInt(500) + 1;
	}

	public int resultado(int num) {
		if (num < this.numero) {
			this.intentos++;
			return 1;
		} else if (num > this.numero) {
			this.intentos++;
			return -1;
		} else {
			return 0;
		}
	}

	public boolean validarNumero(int num) {
		return (num >= 0 && num <= 500) ? true : false;
	}
}
