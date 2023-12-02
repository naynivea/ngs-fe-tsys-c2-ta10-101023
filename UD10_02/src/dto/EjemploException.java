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
public class EjemploException {

	Vista vista = new Vista();

	public void capturarExcepcion() {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			MiException e = new MiException("Esto es un objeto Exception");
			vista.mostrarResultado("Excepcion capturada con mensaje: " + e.getMensaje());
		} catch (Exception error) {
			vista.mostrarResultado(error.getMessage());
		} finally {
			vista.mostrarResultado("Final del programa");
		}
	}

}
