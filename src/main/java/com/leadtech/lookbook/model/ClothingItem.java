package com.leadtech.lookbook.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.Data;

@Entity
@Data
@Table(name = "clothing_item")
public class ClothingItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private ListaCategoria categoria;
    private String cor;
    
    @Enumerated(EnumType.STRING)
    private ListaTamanho tamanho;
    
    @Column(name = "imagem_url")
    private String imagemURL;
    private String material;
    private String marca;
    
    @Enumerated(EnumType.STRING)
    private ListaPadrao padrao;
    private Double preco;
    
    @Column(name = "data_cadastro")
    private LocalDate dataCadrasto;
    
    @Enumerated(EnumType.STRING)
    private ListaSazonalidade sazonalidade;
    
    @ManyToMany(mappedBy = "clothingItems")
    @Valid
    private List<Lookbook> lookbooks;
}
