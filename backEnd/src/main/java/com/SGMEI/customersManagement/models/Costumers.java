package com.SGMEI.customersManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Costumers {
	
	@Id
	@Column(name="id_cliente", nullable = false, unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCliente;
	
	@Column(name="cpf")
	private String CPF;
	
	@Column(name="nom_cliente")
	private String nomeCliente;
	
	@Column(name="tel_cliente")
	private String telCliente;
	
	@Column(name="email_cliente")
	private String emailCliente;
	
	@Column(name="dat_nascimento_cliente")
	private String datNascimentoCliente;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getDatNascimentoCliente() {
		return datNascimentoCliente;
	}

	public void setDatNascimentoCliente(String datNascimentoCliente) {
		this.datNascimentoCliente = datNascimentoCliente;
	}

}
