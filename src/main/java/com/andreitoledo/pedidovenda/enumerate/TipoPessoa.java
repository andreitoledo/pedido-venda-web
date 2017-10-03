package com.andreitoledo.pedidovenda.enumerate;

public enum TipoPessoa {	
	
	FISICA("Física"),
	JURIDICA("Juridica");
	
	private TipoPessoa(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}	
	

}
