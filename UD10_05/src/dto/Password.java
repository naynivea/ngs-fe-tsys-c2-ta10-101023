/**
 * 
 */
package dto;

import java.util.Random;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Password {
	private static final int LONGITUD_DEF = 8;

	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = LONGITUD_DEF;
		this.contrasena = generarPassword();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;

		for (int i = 0; i < this.contrasena.length(); i++) {
			if (Character.isUpperCase(this.contrasena.charAt(i))) {
				mayusculas++;
			} else if (Character.isLowerCase(this.contrasena.charAt(i))) {
				minusculas++;
			} else if (Character.isDigit(this.contrasena.charAt(i))) {
				numeros++;
			}
		}

		return (mayusculas > 2 && minusculas > 1 && numeros > 5) ? true : false;
	}

	private String generarPassword() {
		Random random = new Random();
		String caracteres = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
		String resultado = "";

		for (int i = 0; i < this.longitud; i++) {
			resultado += caracteres.charAt(random.nextInt(caracteres.length()));
		}
		return resultado;
	}

}
