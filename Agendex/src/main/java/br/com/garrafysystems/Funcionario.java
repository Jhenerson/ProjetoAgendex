package br.com.garrafysystems;

import java.util.Date;

public class Funcionario {

	private String nome;
	private long CPF;
	private String email;
	private String endereco;
	private String telefone;
	private Date dataDeNascimento;
	private String sexo;

	public Funcionario(String nome, long cPF, String email, String endereco, String telefone, Date dataDeNascimento,
			String sexo) {
		this.nome = nome;
		CPF = cPF;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public long getCPF() {
		return CPF;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
