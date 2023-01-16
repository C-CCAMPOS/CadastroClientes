package entities;

public class Cliente {

	private Integer idcliente;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;

	public void setIdCliente(Integer idCliente) {
		this.idcliente = idCliente;
	}

	public Integer getIdCliente() {
		return idcliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

}
