package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 

		/* Em Java, a palavra reservada new é utilizada para criar uma nova instância 
		 * (objeto) de uma classe. Ela aloca espaço na memória para armazenar as características 
		 * do objeto. Ao utilizar new, é necessário especificar o nome da classe da qual deseja-se 					  
		 * criar o objeto. Nesse caso específico, o código cria um objeto da classe Conta, 
	     * que possui atributos: conta, número, agência e titular.*/
		
		primeiraConta.saldo = 200; 

		/* A linha de código 'primeiraConta.saldo = 200;' é responsável por acessar o objeto 
		 * 'primeiraConta' previamente alocado na memória e atribuir o valor '200' 
		 * ao atributo 'saldo'.Essa atribuição de valor atualiza o saldo da conta para 200.*/
		
		System.out.println(primeiraConta.saldo);
		
		/* Ao utilizar 'primeiraConta' seguido do operador ponto (.), 
		 * estamos indicando que desejamos acessar os atributos ou métodos da conta
		 * representada por esse objeto.
		 * O código exibirá o valor atual do atributo saldo da conta no console.
		 * Isso permite verificar o saldo atual da conta primeiraConta. */

	}
}
