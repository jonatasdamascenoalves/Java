package Exercicio;
//3- Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que contando de
//3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.

public class exercicio3 {
	public static void main(String[] args) {
		for (int i = 233; i < 456; i+=3) {
			if (i >299 && i < 401) {
						i+=5;
			}
			System.out	.println(i);	}
	}
}
