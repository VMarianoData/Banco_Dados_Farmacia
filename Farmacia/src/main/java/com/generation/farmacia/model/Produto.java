package com.generation.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo titulo é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo título dece conter no minimo 05 e no máximo 100 caracteres")
	private String Nome;

	@NotBlank(message = "O atributo validade é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo validade deve conter no minímo 3 e no máximo 100 caracteres")
	private String validade;

	@NotBlank(message = "O atributo cor é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo cor deve conter no minímo 3 e no máximo 100 caracteres")
	private String cor;

	@NotBlank(message = "O atributo preco é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo preco deve conter no minímo 3 e no máximo 100 caracteres")
	private String preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@UpdateTimestamp
	private LocalDateTime date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
