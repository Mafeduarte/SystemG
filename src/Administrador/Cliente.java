package Administrador;

public class Cliente {

	String nome, CPF, telefone;
	String cidade, rua, bairro;
	int numerodacasa;

	public Cliente() {

	}

	public Cliente(String nome, String CPF, String telefone, String cidade, String bairro, String rua,
			int numerodacasa) {
		setnome(nome);
		setCPF(CPF);
		settelefone(telefone);
		setcidade(cidade);
		setbairro(bairro);
		setrua(rua);
		setnumerodacasa(numerodacasa);
	}

	public String getNome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String gettelefone() {
		return telefone;
	}

	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public String getbairro() {
		return bairro;
	}

	public void setbairro(String bairro) {
		this.bairro = bairro;
	}

	public String getrua() {
		return rua;
	}

	public void setrua(String rua) {
		this.rua = rua;
	}

	public int getnumerodacasa() {
		return numerodacasa;
	}

	public void setnumerodacasa(int numerodacasa) {
		this.numerodacasa = numerodacasa;
	}

	void listar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nCPF: " + this.CPF);
		System.out.println("\nTelefone: " + this.telefone);
		System.out.println("\nCidade: " + this.cidade);
		System.out.println("\nBairro: " + this.bairro);
		System.out.println("\nRua: " + this.rua);
		System.out.println("\nNumeroDaCasa: " + this.numerodacasa);
	}

}
