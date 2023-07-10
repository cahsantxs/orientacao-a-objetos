package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 

		/* Em Java, a palavra reservada new é utilizada para criar uma nova instância 
		 * (objeto) de uma classe. Ela aloca espaço na memória para armazenar as características 
		 * do objeto. Ao utilizar new, é necessário especificar o nome da classe da qual deseja-se 					  
		 * criar o objeto. Nesse caso específico, o código cria um objeto da classe Conta, 
	     * que possui os atributos: conta, número, agência e titular. */
		
		primeiraConta.saldo = 200; 

		/* A linha de código 'primeiraConta.saldo = 200;' é responsável por acessar o objeto 
		 * 'primeiraConta' previamente alocado na memória e atribuir o valor '200' 
		 * ao atributo 'saldo'.Essa atribuição de valor atualiza o saldo da conta para 200. */
		
		System.out.println(primeiraConta.saldo);
		
		/* Ao utilizar 'primeiraConta' seguido do operador ponto (.), 
		 * estamos indicando que desejamos acessar os atributos ou métodos da conta
		 * representada por esse objeto.
		 * O código exibirá o valor atual do atributo saldo da conta no aonsole.
		 * Isso permite verificar o saldo atual da conta primeiraConta. */
		
		primeiraConta.saldo += 100; 
	
		/* Acessa a propriedade "saldo" do objeto chamado 
		 * "primeiraConta". Adiciona 100 ao valor atual da 
		 * propriedade "saldo" do objeto "primeiraConta". */
		
		System.out.println(primeiraConta.saldo); 

		/* Atualiza o valor da propriedade "saldo" para o novo valor
		 * (que é o valor anterior mais 100). Imprime o novo valor da
		 * propriedade "saldo" na saída do console.*/

		Conta  segundaConta = new Conta();
		
		/* Aqui estamos criando um novo objeto chamado segundaConta do tipo Conta. Estamos utilizando 
		 * a classe 'Conta' para criar uma instância dessa classe e atribuí-la à variável 'segundaConta'. 
		 * Isso significa que agora temos uma segunda conta disponível para ser utilizada no código. */

		segundaConta.saldo = 50;
		
		/* Nesta linha, estamos atribuindo um valor de 50 à propriedade 'saldo' da 'segundaConta'.
		 * Isso significa que definimos o saldo da segunda conta como 50. */
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		
		/* Aqui estamos usando 'System.out.println' para exibir uma mensagem no console.
		 * A mensagem exibida será "primeira conta tem: " seguida do valor do saldo da primeiraConta.
		 * Estamos acessando a propriedade 'saldo' da 'primeiraConta' para obter seu valor atual
		 * e concatenando-o à mensagem. */
		
		/* A concatenação de strings em Java é realizada usando o operador "+" ou o método concat(). 
		 * Em Java, a concatenação é o processo de combinar ou juntar duas ou mais strings para formar 
		 * uma nova string. É uma operação comum quando você precisa criar uma nova string que contenha
		 *  informações combinadas de diferentes fontes. 
		 *
		 *  Exemplo:String str1 = "Olá";
					String str2 = "Mundo";
					String resultado = str1 + " " + str2; // Resultado: "Olá Mundo" */

		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		/* Similarmente à linha anterior, estamos imprimindo uma mensagem no console.
		 * Desta vez, a mensagem exibida será "segunda conta tem: " seguida do valor do saldo da segundaConta.
		 * Estamos acessando a propriedade saldo da segundaConta para obter seu valor atual e concatenando-o à mensagem.*/
			
	}
}
