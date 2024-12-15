package exerciciosrepeticao;

import java.util.Scanner;
/*
  Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

public class ex3_MaiorEMedia {

	public static void main(String[] args) {
	double numero =0;
	double numeroMaior = 0;
	double media = 0;
	double contador = 0;
	Scanner scan = new Scanner(System.in);
	
	do {
		System.out.println("INFORME UM NUMERO");
		numero = scan.nextDouble();
		media += numero;
		
		if(numero>numeroMaior) {
			numeroMaior = numero;
		}
		
		contador++;
	}while(contador <5);
	


	System.out.println("MAIOR NUMERO É: " + numeroMaior);
	System.out.println("MEDIA FOI: " + media/5);
	
	
	}
}
