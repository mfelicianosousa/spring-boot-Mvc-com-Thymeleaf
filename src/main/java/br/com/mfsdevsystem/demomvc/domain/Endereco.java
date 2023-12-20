package br.com.mfsdevsystem.demomvc.domain;

import br.com.mfsdevsystem.demomvc.domain.enums.UF;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name="enderecos")
public class Endereco extends AbstractEntity<Long> {
	
	@NotBlank
	@Size(min = 9, max = 9, message ="{Size.endereco.cep}")
	@Column(nullable=false,  length=9)
	private String cep;
	
	@NotBlank
	@Size(min = 5, max = 100)
	@Column(nullable=false,  length=60)
	private String logradouro;
	
	@NotNull(message = "{NotNull.endereco.numero}")
	@Column(nullable=false,  length=5)
	private String numero;
	
	@Column(nullable=false,  length=20)
	private String complemento;
	
	@NotBlank
	@Size(min = 5, max = 40)
	@Column(nullable=false,  length=40)
	private String bairro;
	
	@NotBlank
	@Size(min = 5, max = 40)
	@Column(nullable=false,  length=40)
	private String cidade;
	
	@NotNull(message = "{NotNull.endereco.uf}")
	@Column(nullable=false,  length=2)
	@Enumerated(EnumType.STRING)
	private UF uf;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
