package app;

import java.util.Scanner;
import java.util.Timer;

public class AtividadeJogooDeAzar {
	/*
	 * Criar um "jogo de azar" onde:
	 * 
	 * a pessoa inicie com um saldo de 100 Montar um menu com 3 opções para o
	 * usuário, sendo elas: Ver o saldo atual Parar de jogar e ficar com o salto
	 * atual Continuar jogando
	 * 
	 * O jogo acaba quando: o usuário chegar a 200 de saldo (exibir mensagem de que
	 * ele ganhou) ficar com o saldo zerado (exibir mensagem de que ele perdeu)
	 * quando ele decidir parar (exibir mensagem agradecendo a participação e
	 * exibindo o saldo final)
	 * 
	 * Quando o usuário pedir para continuar jogando: - Rolar um "dado" que gere um
	 * numero aleatório entre 1 e 100 (não exibir para o usuário o resultado) - Caso
	 * o numero sorteado seja menor que 50, descontar o valor do saldo da pessoa -
	 * Caso seja maior que 50, adicionar metade do valor sorteado ao saldo do
	 * usuário - Caso a pessoa tire 50 no dado, não fazer nada
	 * 
	 * Ao final de cada rodada de dados, remontar o menu com as 3 opções, e deixar o
	 * usuário escolher o que prefere.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite:");
		System.out.println("0 - Parar de Jogar e receber o saldo atual");
		System.out.println("1 - para ver saldo atual");
		System.out.println("2 - Continuar Jogando");
		System.out.println("3 - Ler as regras");
		int opcao = entrada.nextInt();
		double saldo = 100;

		switch (opcao) {

		case 0: {
			System.out.println("Saldo Atual: " + saldo);
			break;
		}

		case 1: {
			System.out.println("Fim Do jogo! Você Ganhou: " + saldo);
			break;
		}
		case 2: {
			saldo = 210;
			if (saldo > 0 && saldo <= 200) {
				System.out.println("Vamos Jogar ...");
				System.out.println("Rolando os Dados ...");

				int dado = (int) (Math.random() * 100) + 1;

				if (dado < 50) {
					System.out.println("Perdeu!");
					saldo = saldo - dado;
					System.out.println("Saldo Atual: " + saldo);

				} else if (dado > 50) {
					System.out.println("Parabens! Você venceu");
					saldo = saldo + (dado / 2);
					System.out.println("Saldo Atual: " + saldo);
				} else
					System.out.println("Empate!");
				
			} else System.out.println("Fim do Jogo. Saldo Atual: " + saldo);
			
			break;
		}
		case 3: {
			System.out.println("regras ...");
			break;

		}

		default:
			System.out.println("Digite um número entre 1 e 4");
			break;
		}
	}
}
