package com.SGMEI.productsManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Product {

	@Id
	@Column(name="id_produto", nullable = false, unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idProduto;
	
	@Column(name="descricao_produto")
	private String descricaoProduto;
	
	@Column(name="val_unitario_produto")
	private Double valUnitarioProduto;
	
	@Column(name="quantidade_estoque_produto")
	private Integer quantidadeEstoqueProduto;
	
	@Column(name="categoria_produto")
	private Integer categoriaProduto;
	
	@Column(name="marca_produto")
	private String marcaProduto;
	
	@Column(name="garantia_produto")
	private String garantiaProduto;

	public long getIdProduto() {
		return idProduto;
	}

	private void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	private void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getValUnitarioProduto() {
		return valUnitarioProduto;
	}

	private void setValUnitarioProduto(Double valUnitarioProduto) {
		this.valUnitarioProduto = valUnitarioProduto;
	}

	public Integer getQuantidadeEstoqueProduto() {
		return quantidadeEstoqueProduto;
	}

	private void setQuantidadeEstoqueProduto(Integer quantidadeEstoqueProduto) {
		this.quantidadeEstoqueProduto = quantidadeEstoqueProduto;
	}

	public Integer getCategoriaProduto() {
		return categoriaProduto;
	}

	private void setCategoriaProduto(Integer categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
	
	public String getGarantiaProduto() {
		return garantiaProduto;
	}

	public void setGarantiaProduto(String garantiaProduto) {
		this.garantiaProduto = garantiaProduto;
	}
}