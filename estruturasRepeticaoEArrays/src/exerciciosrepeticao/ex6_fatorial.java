package exerciciosrepeticao;

import java.util.Scanner;

public class ex6_fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fatorial;

		System.out.println("FATORIAL: ");		
		fatorial = scan.nextInt();
		for(int i = fatorial-1;i>=1;i--) {
			fatorial = (fatorial*i);
			System.out.println(fatorial);
		}
		System.out.println(fatorial);
	}

}
