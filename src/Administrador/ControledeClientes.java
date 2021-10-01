package Administrador;

import java.util.ArrayList;

public class ControledeClientes {

	ArrayList<Cliente> ListagemDeClientes;

	public ControledeClientes() {
		this.ListagemDeClientes = new ArrayList<Cliente>();
	}

	void inserecliente(Cliente novoCliente) {
		ListagemDeClientes.add(novoCliente);
	}

	void listarclientes() {
		System.out.println("Lista de Clientes");

		for (Cliente clientenalista : ListagemDeClientes) {
			clientenalista.listar();
		}
	}
	
}
