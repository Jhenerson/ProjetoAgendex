package br.com.garrafysystems;

public class Clinica {

	private long CNPJ;
	private String razaoSocial;
	private String nomeFantasia;
	private String telefoneUm;
	private String telefoneDois;
	private String endereco;
	private String email;
	private long inscricaoEstadual;
	private long inscricaoMunicipal;

	public Clinica(long CNPJ, String razaoSocial, String nomeFantasia, String telefoneUm, String telefoneDois,
			String endereco, String email, long inscricaoEstadual, long inscricaoMunicipal) {

		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.telefoneUm = telefoneUm;
		this.telefoneDois = telefoneDois;
		this.endereco = endereco;
		this.email = email;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public long getCNPJ() {
		return CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getTelefoneUm() {
		return telefoneUm;
	}

	public String getTelefoneDois() {
		return telefoneDois;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public long getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public long getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setTelefoneUm(String telefoneUm) {
		this.telefoneUm = telefoneUm;
	}

	public void setTelefoneDois(String telefoneDois) {
		this.telefoneDois = telefoneDois;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setInscricaoEstadual(long inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public void setInscricaoMunicipal(long inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

}
