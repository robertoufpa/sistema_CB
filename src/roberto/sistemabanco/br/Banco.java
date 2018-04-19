package roberto.sistemabanco.br;

import java.util.Scanner;

public class Banco extends ContaBancaria{

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Criando uma vari�vel de refer�ncia da classe CONTABANCARIA
		ContaBancaria cb = new ContaBancaria();
		
		//vari�vel para usu�rio escolher op��es (Despositar, Sacar, Transferir, Continuar ou Sair
		int opcao=0; //armazena op��o do cliente
		
		
		do {
			System.out.println("OP��ES:"
					+ "\n1- Depositar"
					+ "\n2-Sacar"
					+ "\n3-Extrato"
					+ "\n4-Sair"
					+ "\nSua op��o �: ");
			opcao = entrada.nextInt();
			
			if (opcao < 1 || opcao > 4) {
				System.out.println("\nOP��O INV�LIDA TENTE NOVAMENTE!");
			}else {
				if (opcao != 4) {
					cb.setUltOp(opcao); //envia o valor da op��o/opera��o
				}
				switch (opcao) {
				
				
				//DEPOSITAR VALOR
				case 1:					
					System.out.println("Quantia a depositar: ");
					int quantia = entrada.nextInt();
					//enviando valor para o metodos
					cb.setDepositadoValor(quantia);
					break;
					
				//SACAR DINHEIRO	
				case 2:
					System.out.println("Quantia a sacar: ");
					int sacar = entrada.nextInt();
					//metodod para saber o valor a sacar
					cb.setValorSacar(sacar);
					cb.MensagemSaque();
					break;
					
				//EXTRATO DA CONTA	
				case 3:
					System.out.println("\nSaldo Atual "+cb.getExtrato());
					break;									
					
				case 4:
					cb.UltimaOP();
					System.exit(0);
					break;
					
					default:System.out.println("\nFINALIZADO SISTEMA!");
				}
				
			}
			}while (opcao != 4);
		}
	}


