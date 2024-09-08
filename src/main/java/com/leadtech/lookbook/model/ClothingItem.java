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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@Table(name = "clothing_item")
public class ClothingItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Categoria é obrigatória")
    @Enumerated(EnumType.STRING)
    private ListaCategoria categoria;

    @NotEmpty(message = "Cor é obrigatória")
    private String cor;

    @NotNull(message = "Tamanho é obrigatório")
    @Enumerated(EnumType.STRING)
    private ListaTamanho tamanho;

    @Column(name = "imagem_url")
    private String imagemURL;

    @NotBlank(message = "Material é obrigatório")
    private String material;

    @NotBlank(message = "Marca é obrigatória")
    private String marca;

    @NotNull(message = "Preço é obrigatório")
    @Positive(message = "O preço deve ser um valor positivo")
    private Double preco;

    @NotNull(message = "Padrão da roupa é obrigatório")
    @Enumerated(EnumType.STRING)
    private ListaPadrao padrao;

    @Column(name = "data_cadastro")
    private LocalDate dataCadrasto;

    @NotNull(message = "Sazonalidade é obrigatória")
    @Enumerated(EnumType.STRING)
    private ListaSazonalidade sazonalidade;

    @ManyToMany(mappedBy = "clothingItems")
    @Valid
    private List<Lookbook> lookbooks;
    
    @Override
    public String toString() {
        return "ClothingItem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

}
