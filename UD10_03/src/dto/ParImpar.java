/**
 * 
 */
package dto;

import exception.MiException;
import view.Vista;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class ParImpar {
	private int num;

	public ParImpar(int num) {
		this.num = num;
	}

	public void esImparOpar() {
		Vista vista = new Vista();
		try {
			if (num % 2 == 0) {
				MiException e = new MiException("Es par");
				vista.mostrarResultado(e.getMensaje());
			} else {
				MiException e = new MiException("EsImpar");
				vista.mostrarResultado(e.getMensaje());
			}
		} catch (Exception error) {
			vista.mostrarResultado(error.getMessage());
		}
	}

}
