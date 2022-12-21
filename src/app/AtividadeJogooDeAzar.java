package app;

import java.util.Scanner;
import java.util.Timer;

public class AtividadeJogooDeAzar {
	
	public static void main(String[] args) {

		int opcao;
		double saldo = 100;

		do {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite:");
			System.out.println("1 - para ver saldo atual");
			System.out.println("2 - Continuar Jogando");
			System.out.println("3 - Ler as regras");
			System.out.println("0 - Parar de Jogar e receber o saldo atual");

			opcao = entrada.nextInt();
			
		switch (opcao) {
		
		case 1: {
			System.out.println("Saldo Atual: " + saldo);
			break;
		}
		
		case 2: {
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
				
			} else {
				System.out.println("Fim do Jogo. Saldo Atual: " + saldo);
				break;
			}
			
			break;
		}
		case 3: {
			System.out.println(" ... REGRAS ... \n "
					+ "Um dado é rolado virtualmente e gera um numero aleatório entre 1 e 100. \n"
					+ "	- Caso o numero sorteado seja menor que 50, é descontado o valor do saldo do usuário \n"
					+ "	- Caso seja maior que 50, é adicionado metade do valor sorteado ao saldo do usuário \n"
					+ "	- Caso tire 50 no dado, empate \n"
					+ "O jogo acaba quando o usuário chegar a 200 de saldo, ficar com o saldo zerado ou quando ele decidir parar \n");
			break;
		}
		case 0: {
			System.out.println("Fim Do jogo! Você Ganhou: " + saldo);
			break;
		}

		default:
			System.out.println("Digite um número entre 0 e 3");
			break;
		}
		} while (opcao != 0);
	}
}
