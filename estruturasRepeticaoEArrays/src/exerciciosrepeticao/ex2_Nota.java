package exerciciosrepeticao;

import java.util.Scanner;

/*
  Faça um programa que peça uma nota, entre zero e dez. 
  Mostre uma mensagem caso o valor seja inválido e continue 
  pedindo até que o usuário informe um valor válido.
 */

public class ex2_Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota = 0;
		
		while(true) {
			System.out.println("Digite uma nota");
			nota = scan.nextInt();
			
			if(nota>=0 && nota <=10) {
				System.out.println("NOTA ACEITA: " + nota);
				break;
			} else {
				System.out.println("VALOR INVALIDO");
			}
		}

	}

}
