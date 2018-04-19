package roberto.sistemabanco.br;

import java.util.Scanner;

public class Banco extends ContaBancaria{

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Criando uma variável de referência da classe CONTABANCARIA
		ContaBancaria cb = new ContaBancaria();
		
		//variável para usuário escolher opções (Despositar, Sacar, Transferir, Continuar ou Sair
		int opcao=0; //armazena opção do cliente
		
		
		do {
			System.out.println("OPÇÕES:"
					+ "\n1- Depositar"
					+ "\n2-Sacar"
					+ "\n3-Extrato"
					+ "\n4-Sair"
					+ "\nSua opção é: ");
			opcao = entrada.nextInt();
			
			if (opcao < 1 || opcao > 4) {
				System.out.println("\nOPÇÃO INVÁLIDA TENTE NOVAMENTE!");
			}else {
				if (opcao != 4) {
					cb.setUltOp(opcao); //envia o valor da opção/operação
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


