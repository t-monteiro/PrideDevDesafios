package desafios;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos números voce deseja gerar: ");
		int qtdNum = entrada.nextInt();

		System.out.println("Quantos jogos voce deseja gerar: ");

		int qtdJogos = entrada.nextInt();

		if (qtdNum < 6 || qtdNum > 15) {
			System.out.print("Quantidade de numeros incorreta!");
		}

		Random gerador = new Random();
		for (int i = 0; i < qtdJogos; i++) {
			HashSet<Integer> sorteio = new HashSet<>();

			while (sorteio.size() < qtdNum) {

				sorteio.add(gerador.nextInt(60) + 1);
			}
			System.out.println("Resultado do sorteio: " + sorteio);
		}

		entrada.close();

	}
}