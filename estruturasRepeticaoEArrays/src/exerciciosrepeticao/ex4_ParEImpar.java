package exerciciosrepeticao;

import java.util.Scanner;
/*
 Par e Ímpar: Faça um programa que peça N números inteiros. 
 Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */

public class ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNum =0;
		int numero = 0;
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite a quantidade de numero");
		quantidadeNum = scan.nextInt();
		
		do {
			System.out.println("Digite um numero");
			numero = scan.nextInt();
			
			if(numero%2==0) {
				par++;
			} else if(numero%2==1) {
				impar++;
			}
			
			
			quantidadeNum--;
		}while(quantidadeNum>0);
		
		System.out.println("QUANTIDADE NUMEROS PARES: " + par);
		System.out.println("QUANTIDADE NUMEROS IMPARES: " + impar);
	}

}
