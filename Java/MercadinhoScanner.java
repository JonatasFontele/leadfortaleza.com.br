package classes;

import java.util.Scanner;
 
public class MercadinhoScanner {
	
	public static void main(String args[]) {
	// Lista de produtos e seus respectivos preços
		String produtos[] = {"", "Macarrão", "Arroz", "Batata", "Café", "Leite", "Feijão"};
		double precos [] = {0, 1.99, 2.75, 3.80, 4.00, 2.99, 3.50};

		// Objeto para leitura de entrada de dados via teclado
		Scanner entradaTeclado = new Scanner(System.in);

		//Obter o código do produto de 1 a 6
		System.out.println("informe o código dos produtos");
		int codigoProduto = entradaTeclado.nextInt();

		//Se o código do produto estiver correto, solicitar a quantidade do produto
		if (codigoProduto > 0 && codigoProduto < produtos.length) {
				System.out.println("Produto:" + produtos[codigoProduto]);

				//Obter a quantidade do produto
				System.out.println("informe a quantidade do produto");
				int quantidade = entradaTeclado.nextInt();

				//Calcula valor total
				double total = precos[codigoProduto] * quantidade;
				System.out.println("TOTAL: R$" + total);

		} else {
			System.out.println("Produto não encontrado");
		}
		entradaTeclado.close();
	}
}
