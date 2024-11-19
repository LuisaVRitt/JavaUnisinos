package desafio_laboratorio_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		int resp;
		
		//menu
		do {
			System.out.println("( 1 ) criar uma loja");
			System.out.println("( 2 ) criar um produto");
			System.out.println("( 3 ) sair");
			resp = sc.nextInt();
			
			switch(resp) {
			 case 1: 
				 criarLoja();
			 case 2:
				 criarProduto();
			 case 3:
				 System.out.println("Saindo...");
			 default:
				 System.out.println("Opção Inválida.");
			}
			
			
		}while(resp!=3);
				
		
		 
		sc.close();
		scString.close();
		
	}
	
	
	
	public static void criarLoja() {
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		System.out.println("Digite o nome da loja: ");
		String nome = scString.nextLine();
		System.out.println("Digite a quantidade de funcionários desta loja: ");
		int quantidadeFuncionarios = sc.nextInt();
		System.out.println("Digite o salário base dos funcionários: ");
		int salarioBaseFuncionario = sc.nextInt();
		System.out.println("Digite a rua que a loja fica localizada: ");
		String nomeDaRua = scString.nextLine();
		System.out.println("Digite o número da rua: ");
		String numero = scString.nextLine();
		System.out.println("Digite a cidade: ");
		String cidade = scString.nextLine();
		System.out.println("Digite o estado: ");
		String estado = scString.nextLine();
		System.out.println("Digite o país: ");
		String pais = scString.nextLine();
		System.out.println("Digite o CEP: ");
		String cep = scString.nextLine();
		System.out.println("Digite o complemento: ");
		String complemento = scString.nextLine();
		System.out.println("Digite o dia da data de fundação da loja: ");
		int dia = sc.nextInt();
		System.out.println("Digite o mês da data de fundação da loja: ");
		int mes = sc.nextInt();
		System.out.println("Digite o ano da data de fundação da loja: ");
		int ano = sc.nextInt();
		System.out.println("Digite a quantidade máxima de produtos: ");
		int quantMaxProdutos = sc.nextInt();
		
		Data dataFundacao = new Data(dia, mes, ano);
		Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
		Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
		
		sc.close();
		scString.close();
	}
	
	public static void criarProduto() {
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = scString.nextLine();
		System.out.println();
		double preco = sc.nextDouble();
		System.out.println("Digite o dia da Data de Validade do produto: ");
		int dia = sc.nextInt();
		System.out.println("Digite o mês da Data de Validade do produto: ");
		int mes = sc.nextInt();
		System.out.println("Digite o ano da Data de Validade do produto: ");
		int ano = sc.nextInt();
		Data dataValidade = new Data(dia, mes, ano);
		Produto produto = new Produto(nome, preco, dataValidade);
		
		Data data = new Data(20, 10, 2023);
		
		if(produto.estaVencido(data) == true) {
			System.out.println("PRODUTO VENCIDO");
		}
		else if(produto.estaVencido(data) == false) {
			System.out.println("PRODUTO NÃO VENCIDO");
		}
		
		sc.close();
		scString.close();
	}
	
}

