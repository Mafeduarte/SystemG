package Administrador;

import java.util.ArrayList;

public class ListadeProdutos {
	ArrayList<Produto> listaDeProdutos;
	
	public ListadeProdutos() {
		this.listaDeProdutos = new ArrayList<>();
		
	}
	
	void insereProd(Produto prod) {
		listaDeProdutos.add(prod);
	}
	
	void listarProdutos() {
		System.out.println("\nLista de Produtos\n");
		
		for(Produto p : listaDeProdutos) {
			p.listar();
		}
	}
	
}
