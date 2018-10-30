package br.com.deliverIT.model;

import java.time.LocalDate;

public class Conta {
	private long id;
	private String nome;
	private Double valorOriginal;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	
	public Conta(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	
}
