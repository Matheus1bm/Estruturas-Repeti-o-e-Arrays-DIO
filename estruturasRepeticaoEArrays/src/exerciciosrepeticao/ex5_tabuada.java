package exerciciosrepeticao;

import java.util.Scanner;
/*
 Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
 O usuário deve informar de qual numero ele deseja ver a tabuada.
 */

public class ex5_tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tabuada;

		
		System.out.println("INFORME O NUMERO DA TABUADA DESEJADA: ");
		tabuada = scan.nextInt();
		
		for(int i=0;i<=10;i++) {
		System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
		

	}

}
