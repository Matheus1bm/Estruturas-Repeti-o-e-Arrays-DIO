package exerciciosarray;

import java.util.Scanner;

public class ex2_Consoantes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;

		int count = 0;
		do {
			System.out.println("Digite uma letra: ");
			String letra = scan.next();

			// equalsIgnoreCase
			if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {

				consoantes[count] = letra;
				quantidadeConsoantes++;

			}
			count++;

		} while (count < consoantes.length);

		for (String consoante : consoantes) { // for each//
			if (consoante != null) {
				System.out.print(consoante + " ");
			}
			
		}
		System.out.println("Quant de consoantes: " + quantidadeConsoantes);
	}

}
