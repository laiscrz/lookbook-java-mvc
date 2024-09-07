package com.leadtech.lookbook.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    private String categoria;
    private String cor;
    private String tamanho;
    
    @Column(name = "imagem_url")
    private String imagemURL;
    private String material;
    private String marca;
    private String padrao;
    private Double preco;
    
    @Column(name = "data_cadastro")
    private LocalDate dataCadrasto;
    private String sazonalidade;
    
    @ManyToMany(mappedBy = "clothingItems")
    @Valid
    private List<Lookbook> lookbooks;
}
