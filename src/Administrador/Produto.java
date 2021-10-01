package Administrador;

public class Produto {
	String nome_P;
	int cod_P;
	String desc_P;
	float valor_P;
	
	public Produto() {
		
	}
	
	public Produto(String nome_P,int cod_P, String desc_P, float valor_P ) {
		setNome(nome_P);
		setCodigo(cod_P);
		setDescricao(desc_P);
		setValor(valor_P);
	}
	
	public String getNome() {
		return nome_P;
	}
	public void setNome(String nome_P) {
		this.nome_P = nome_P;
	}
	
	public int getCodigo() {
		return cod_P;
	}
	public void setCodigo(int cod_P) {
		this.cod_P = cod_P;
	}
	
	public String getDescricao() {
		return desc_P;
	}
	public void setDescricao(String desc_P) {
		this.desc_P = desc_P;
	}
	
	public float getValor() {
		return valor_P;
	}
	public void setValor(float valor_P) {
		this.valor_P = valor_P;
	}
	
	void listar() {
		System.out.println("Nome: " + this.nome_P);
		System.out.println("Codigo: " + this.cod_P);
		System.out.println("Descrição: " + this.desc_P);
		System.out.println("Valor: " + this.valor_P);
	}
}
