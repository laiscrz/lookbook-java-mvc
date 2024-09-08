package com.leadtech.lookbook.model;

public enum ListaPadrao {
	LISTRADO("Listrado"), FLORAL("Floral"), XADREZ("Xadrez"), POÁ("Poá"), LISO("Liso"), ABSTRATO("Abstrato"),
	GEOMETRICO("Geométrico"), ANIMAL_PRINT("Animal Print"), ESTAMPADO("Estampado");

	private final String descricao;

	ListaPadrao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
