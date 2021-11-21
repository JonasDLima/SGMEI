package com.SGMEI.productsManagement.models;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.SGMEI.customersManagement.models.Costumers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="servicos")
public class Servicing {
	
	@Id
	@Column(name="id_servico", nullable = false, unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idServico;
	
	@Column(name="descricao_servico")
	private String descricaoServico;
	
	@Column(name="val_servico")
	private Double valServico;
	
	@Column(name="val_DaPeca_servico")
	private Double valDaPecaServico;
	
	@Column(name="orcamento")
	private boolean isOrcamento;
	
	@Column(name="dat_entrada_servico")
	private String datEntradaServico;
	
	@Column(name="dat_saida_servico")
	private String datSaidaServico;
	
	@Column(name="val_final_servico")
	private Double valFinalServico;
	
	@Column(name="andamento_servico")
	private char andamentoServico;
	
//	@OneToMany
//	@JoinColumn(name="clientes_id_cliente")
//	private List<Costumers> idRequisitante;

	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}

	public long getIdServico() {
		return idServico;
	}
	
	public void setIdServico(long idServico) {
		this.idServico = idServico;
	}
	
	public String getDescricaoServico() {
		return descricaoServico;
	}
	
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	
	public Double getValServico() {
		return valServico;
	}
	
	public void setValServico(Double valServico) {
		this.valServico = valServico;
	}
	
	public Double getValDaPecaServico() {
		return valDaPecaServico;
	}
	
	public void setValDaPecaServico(Double valDaPecaServico) {
		this.valDaPecaServico = valDaPecaServico;
	}
	
	public boolean isOrcamento() {
		return isOrcamento;
	}

	public void setOrcamento(boolean isOrcamento) {
		this.isOrcamento = isOrcamento;
	}

	public String getDatEntradaServico() {
		return datEntradaServico;
	}

	public void setDatEntradaServico(String datEntradaServico) {
		this.datEntradaServico = datEntradaServico;
	}

	public String getDatSaidaServico() {
		return datSaidaServico;
	}

	public void setDatSaidaServico(String datSaidaServico) {
		this.datSaidaServico = datSaidaServico;
	}

	public Double getValFinalServico() {
		return valFinalServico;
	}

	public void setValFinalServico(Double valFinalServico) {
		this.valFinalServico = valFinalServico;
	}

	public char getAndamentoServico() {
		return andamentoServico;
	}

	public void setAndamentoServico(char andamentoServico) {
		this.andamentoServico = andamentoServico;
	}

//	public List<Costumers> getIdRequisitante() {
//		return idRequisitante;
//	}
//
//	public void setIdRequisitante(List<Costumers> idRequisitante) {
//		this.idRequisitante = idRequisitante;
//	}
}
