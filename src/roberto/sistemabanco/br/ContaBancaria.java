package roberto.sistemabanco.br;

public class ContaBancaria {
	
	private int quantiaAtual;
	private int valor_sacar;
	private int ultima_op;
	
	//Metododo que s� deposita valor
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
	//Testar se h� dinherio suficiente
	public boolean ValidarSaque () {
		if (this.quantiaAtual >= this.valor_sacar) {
			this.quantiaAtual -= this.valor_sacar; //faz a opera��o de retirada
			return true;
		}else {
			return false;
		}
	}
	
	//Respons�vel s� por mensagem
	public void MensagemSaque () {
		if (this.ValidarSaque() == true) {
			System.out.println ("\nSEU DINHEIRO SAIR� EM POUCOS SEGUNDOS ... ");
		}else {
			System.out.println ("\nN�O H� DINHEIRO SUFICIENTE NA CONTA ");
		}
	}
	
	//responsavel por armazenar valor da ultima opera��o
	public void setUltOp (int op) {
		this.ultima_op = op;
	}
	
	//Mensagem da ultima opera��o realizada
	public void UltimaOP () {
		if (this.ultima_op == 1) {
			System.out.println("\nSua �ltima oprea��o foi DEPOSITO");
		}else if(this.ultima_op == 2)
			System.out.println("\nSua �ltima oprea��o foi SAQUE");
		else {
			System.out.println("\nSua �ltima oprea��o foi EXTRATO");
		}
	}
}


