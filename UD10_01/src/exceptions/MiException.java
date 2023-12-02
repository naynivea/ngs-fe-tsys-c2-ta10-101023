/**
 * 
 */
package exceptions;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class MiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoException;

	public MiException(int codigoException) {
		super();
		this.codigoException = codigoException;
	}

	public MiException() {
		super();
	}

	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoException) {
		case 1:
			mensaje = "Exception 1: El numero indicado est� fuera del rango de 1 y 500. Intenta otra vez";
			break;
		case 2:
			mensaje = "Exception 2: El valor indicado no es un n�mero. Intenta otra vez";
			break;
		}

		return mensaje;
	}

}
