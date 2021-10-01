package Administrador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc;
		String nome, cpf, numero;
		String cidade, rua, bairro;
		int numerodacasa;

		ControledeClientes novalista = new ControledeClientes();
		Cliente novocliente = new Cliente();

		Scanner teclado;

		teclado = new Scanner(System.in);
		
		String nome_prod, descri_prod;
		float valor_prod;
		int codigo_prod; 
		ListadeProdutos listaProd = new ListadeProdutos();
		Produto novoProduto = new Produto();
		
		Scanner tec = new Scanner(System.in); 

		do {
			System.out.println("**************************");
			System.out.println("*******MENU CLIENTE*******");
			System.out.println("1- Cadastro de Clientes");
			System.out.println("2- Listar Clientes");
			System.out.println("**************************");
			System.out.println("*******MENU PRODUTO*******");
			System.out.println("3 - Inserir Produto");
			System.out.println("4 - Mostrar Produtos");
			System.out.println("0 - Sair");
			System.out.println("***************************\n");


			opc = teclado.nextInt();
			teclado.nextLine();

			switch (opc) {
			case 1:
				System.out.println("\nNome: ");
				nome = teclado.nextLine();
				System.out.println("\nCPF: ");
				cpf = teclado.nextLine();
				System.out.println("\nNumero de Telefone: ");
				numero = teclado.nextLine();
				System.out.println("\n=====Dados de Endereço=====");
				System.out.println("\nCidade que reside: ");
				cidade = teclado.nextLine();
				System.out.println("\nBairro da residência: ");
				bairro = teclado.nextLine();
				System.out.println("\nRua da residência: ");
				rua = teclado.nextLine();
				System.out.println("\nNúmero da residência: ");
				numerodacasa = teclado.nextInt();
				teclado.nextLine();
				novocliente = new Cliente(nome, cpf, numero, cidade, bairro, rua, numerodacasa);
				novalista.inserecliente(novocliente);
				break;
			case 2:
				novalista.listarclientes();
				break;
			case 3:
				System.out.println("Insira o nome do Produto\n");
				nome_prod = tec.nextLine();
				System.out.println("Insira o codigo do Produto\n");
				codigo_prod = tec.nextInt();
				tec.nextLine();
				System.out.println("Insira a descrição do Produto\n");
				descri_prod = tec.nextLine();
				System.out.println("Insira o valor do Produto\n");
				valor_prod = tec.nextFloat();
				
				novoProduto = new Produto(nome_prod, codigo_prod, descri_prod,valor_prod);
				
				listaProd.insereProd(novoProduto);
				break;
			case 4:
				listaProd.listarProdutos();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			
			default:
				System.out.println("Opção Invalida !");
				break;
			}

		} while (opc != 0);

	}
	
}
