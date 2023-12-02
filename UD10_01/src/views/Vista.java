/**
 * 
 */
package views;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.AdivinaNumero;
import exceptions.MiException;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Vista {
	public void mostrarResultado() {

		Scanner entrada = new Scanner(System.in);
		AdivinaNumero adivina = new AdivinaNumero();

		boolean seguir = true;
		int num = 0;
		System.out.println("Bienvenido al juego Adivina N�mero");
		while (seguir) {
			try {
				System.out.println("Introduce un valor entre 1 y 500");
				num = entrada.nextInt();
				try {
					if (adivina.validarNumero(num)) {
						switch (adivina.resultado(num)) {
						case 1:
							System.out.println("Es mayor, intenta otra vez");
							break;
						case -1:
							System.out.println("Es menor, intenta otra vez");
							break;
						case 0:
							System.out.println("Enhorabuena! Has Ganado en " + adivina.getIntentos() + " intentos");
							seguir = false;
						}
					}
				} catch (Exception error) {
					MiException e = new MiException(1);
					System.out.println(e.getMessage());
					adivina.setIntentos(adivina.getIntentos() + 1);
					entrada.next();
				}
			} catch (InputMismatchException error) {
				MiException e = new MiException(2);
				System.out.println(e.getMessage());
				adivina.setIntentos(adivina.getIntentos() + 1);
				entrada.next();
			}
		}
	}
}
