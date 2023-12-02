/**
 * 
 */

import java.util.Scanner;

import dto.ParImpar;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class ParImparApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira un nmero: ");
		int num = entrada.nextInt();

		ParImpar parOimpar = new ParImpar(num);
		parOimpar.esImparOpar();
	}

}
