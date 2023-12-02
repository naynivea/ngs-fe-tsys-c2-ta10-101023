/**
 * 
 */
package exception;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class MiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public MiException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

}
