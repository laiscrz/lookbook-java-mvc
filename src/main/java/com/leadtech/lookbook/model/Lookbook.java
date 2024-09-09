package com.leadtech.lookbook.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "lookbook")
public class Lookbook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Nome do lookbook é obrigatório")
	private String nome;
	
	@Column(name = "data_criacao")
	private LocalDate dataCriacao;
	
	@ManyToMany
    @JoinTable(
        name = "lookbook_clothing_item", // Tabela de junção para n:n
        joinColumns = @JoinColumn(name = "lookbook_id"), // Chave estrangeira da tabela Lookbook
        inverseJoinColumns = @JoinColumn(name = "clothing_item_id") // Chave estrangeira da tabela ClothingItem
    )

	@Valid
	@Size(min = 1, message = "É necessário selecionar pelo menos uma peça")
	private List<ClothingItem> clothingItems;
	
	@Override
	public String toString() {
	    return "Lookbook{" +
	            "id=" + id +
	            ", nome='" + nome + '\'' +
	            '}';
	}
	
    public double getValorTotal() {
        return clothingItems.stream()
            .mapToDouble(ClothingItem::getPreco)
            .sum();
    }


}
