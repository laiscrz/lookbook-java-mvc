package com.leadtech.lookbook.model;

public enum ListaCategoria {

	CAMISETA("Camiseta"), CALÇA("Calça"), VESTIDO("Vestido"), JAQUETA("Jaqueta"), SAIA("Saia"), SHORTS("Shorts"),
	SUETER("Suéter"), CAMISA("Camisa"), JAQUETA_CASACO("Jaqueta Casaco"), CONJUNTO("Conjunto");

	private final String descricao;

	ListaCategoria(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
