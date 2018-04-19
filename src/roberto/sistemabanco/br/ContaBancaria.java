package roberto.sistemabanco.br;

public class ContaBancaria {
	
	private int quantiaAtual;
	private int valor_sacar;
	private int ultima_op;
	
	//Metododo que só deposita valor
	public void setDepositadoValor (int quant) {
		this.quantiaAtual = + quant;		
	}
	//mostra quanto quantia atual
	public int getExtrato () {
		return this.quantiaAtual;
	}
	
	//Armazenar o valor a ser sacado
	public void setValorSacar (int valor) {
		this.valor_sacar = valor;
	}
	//Testar se há dinherio suficiente
	public boolean ValidarSaque () {
		if (this.quantiaAtual >= this.valor_sacar) {
			this.quantiaAtual -= this.valor_sacar; //faz a operação de retirada
			return true;
		}else {
			return false;
		}
	}
	
	//Responsável só por mensagem
	public void MensagemSaque () {
		if (this.ValidarSaque() == true) {
			System.out.println ("\nSEU DINHEIRO SAIRÁ EM POUCOS SEGUNDOS ... ");
		}else {
			System.out.println ("\nNÃO HÁ DINHEIRO SUFICIENTE NA CONTA ");
		}
	}
	
	//responsavel por armazenar valor da ultima operação
	public void setUltOp (int op) {
		this.ultima_op = op;
	}
	
	//Mensagem da ultima operação realizada
	public void UltimaOP () {
		if (this.ultima_op == 1) {
			System.out.println("\nSua última opreação foi DEPOSITO");
		}else if(this.ultima_op == 2)
			System.out.println("\nSua última opreação foi SAQUE");
		else {
			System.out.println("\nSua última opreação foi EXTRATO");
		}
	}
}


