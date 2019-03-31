package br.com.garrafysystems;

import java.util.Date;

public class Paciente {

	private long CPF;
	private String nome;
	private String nomeSocial;
	private String telefone;
	private String email;
	private Date dataDeNascimento;
	private String endereco;
	private String sexo;

	public Paciente(String nome, String nomeSocial, String telefone, String email, Date dataDeNascimento, String sexo) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.telefone = telefone;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		this.setSexo(sexo);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getCPF() {
		return CPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
