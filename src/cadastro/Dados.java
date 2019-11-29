package cadastro;

import java.util.Calendar;

public class Dados {
	
	private long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString(){
		return "id: " + this.id + "\nnome: " + this.nome + "\nEmail: " + this.email + "\nEndereco: " + this.endereco + "\nData Nascimento:" + this.dataNascimento;
	}

}
