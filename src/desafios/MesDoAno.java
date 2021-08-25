package desafios;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 1;

		while (numero != 0) {
			System.out.println("Digite um número para verificar seu mês correspondente ou digite 0 para SAIR: ");

			numero = entrada.nextInt();

			switch (numero) {

			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;

			case 0:
				System.exit(numero);

			default:
				System.out.println("Não existe mês correspondente a esse valor");
			}
		}

		entrada.close();
	}
}
