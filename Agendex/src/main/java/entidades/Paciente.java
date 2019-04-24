package entidades;

import java.util.Date;

public class Paciente {

	private String CPF;
	private String nomeCompleto;
	private String nomeSocial;
	private String email;
	private String telefone;
	private String RG;
	private String orgaoExpedidor;
	private Date dataDeNascimento;
	private String sexo;

	public Paciente(String CPF, String nomeCompleto, String nomeSocial, String email, String telefone, String RG,
			String orgaoExpedidor, Date dataDeNascimento, String sexo) {
		this.CPF = CPF;
		this.nomeCompleto = nomeCompleto;
		this.nomeSocial = nomeSocial;
		this.email = email;
		this.telefone = telefone;
		this.RG = RG;
		this.orgaoExpedidor = orgaoExpedidor;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
	}

	private String getCPF() {
		return this.CPF;
	}

	private String getNomeCompleto() {
		return nomeCompleto;
	}

	private String getNomeSocial() {
		return nomeSocial;
	}

	private String getEmail() {
		return email;
	}

	private String getTelefone() {
		return telefone;
	}

	private String getRG() {
		return RG;
	}

	private String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	private Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	private String getSexo() {
		return sexo;
	}

	private void setCPF(String CPF) {
		this.CPF = CPF;
	}

	private void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	private void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private void setRG(String RG) {
		this.RG = RG;
	}

	private void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	private void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

}