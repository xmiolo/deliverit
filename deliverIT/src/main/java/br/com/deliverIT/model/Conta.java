package br.com.deliverIT.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Double valorOriginal;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	
	public Conta() {}
	
	public Conta(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Conta(String nome, String valorOriginal, String dataVencimento, String dataPagamento) {
		this.nome = nome;
		this.valorOriginal = Double.parseDouble(valorOriginal.replace(",", "."));
		this.dataVencimento = LocalDate.parse(dataVencimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.dataPagamento = LocalDate.parse(dataPagamento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	
}
