import java.util.Scanner;

public class CaixaEletronico
{
	public static void main(String args[])
	{
		int numeroC;
		String titularC;
		double saldoC;
		double limiteC;
		int acao;
		
		boolean sair = true;
		
		ContaCorrente cCorrente;
		Scanner scanner = new Scanner(System.in);
		
			System.out.printf("\n==========================\n");
			System.out.printf("\nAbertura de Conta Corrente\n");
			System.out.printf("\n==========================\n");
			
			System.out.printf("\nTitular: ");
 			titularC = scanner.nextLine();
			
			System.out.printf("\nNúmero : ");
			numeroC = scanner.nextInt();

			System.out.printf("\nSaldo  : ");
 			saldoC = scanner.nextDouble();

			System.out.printf("\nLimite : ");
			limiteC = scanner.nextDouble();
			
			cCorrente = new ContaCorrente(numeroC, titularC, saldoC, limiteC);
						
			System.out.printf("\n==========================");
			System.out.printf("\nAbertura de Conta Corrente");
			System.out.printf("\n        Encerrada         ");
			System.out.printf("\n==========================");
		
				
			System.out.printf("\n  Movimentacao de Conta   ");
			cCorrente.verDados();
			System.out.printf("\n**************************");
			System.out.printf("\n1 - Saque 					  ");
			System.out.printf("\n2 - Deposito				  ");
			System.out.printf("\n3 - Saldo					  ");
			System.out.printf("\n4 - Sair						  ");
			System.out.printf("\n**************************\n");
		
		do{

			System.out.printf("\nDigite uma das opções: ");

			acao = scanner.nextInt();
			
			if (acao < 0 || acao > 4)
			{
				System.out.print("\nValor digitado incorreto.\n");
			} else {
				
				switch(acao){
					case 1: 
						System.out.printf("\nDigite o valor do saque: ");
						cCorrente.saque(scanner.nextDouble());
						break;
					case 2:
						System.out.printf("\nDigite o valor do deposito: ");
						cCorrente.deposito(scanner.nextDouble());
						break;
					case 3:
						cCorrente.verSaldo();
						break;
					case 4:
						System.out.printf("\nSua sessão será encerrada. Obrigado!\n");
					default: break;
				}
			
			}
						
						
		}while(acao != 4);
	}	
}
