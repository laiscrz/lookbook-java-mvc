package com.leadtech.lookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadtech.lookbook.model.ClothingItem;
import com.leadtech.lookbook.model.Lookbook;
import com.leadtech.lookbook.repository.ClothingItemRepository;

@Service
public class ClothingItemService {
    @Autowired
    private ClothingItemRepository clothingItemRepository;

    public List<ClothingItem> listarTodos() {
        return clothingItemRepository.findAll();
    }

    public void salvar(ClothingItem clothingItem) {
    	
    	if (clothingItem.getId() != null) {
            // Atualizar o Lookbook existente
    		clothingItemRepository.save(clothingItem);
        } else {
            // Criar um novo Lookbook
        	clothingItemRepository.save(clothingItem);
        }
        
        clothingItemRepository.save(clothingItem);
    }
    

    public ClothingItem buscarPorId(Long id) {
        return clothingItemRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        ClothingItem clothingItem = buscarPorId(id);
        if (!clothingItem.getLookbooks().isEmpty()) {
            throw new RuntimeException("A peça está vinculada a um lookbook");
        }
        clothingItemRepository.deleteById(id);
    }

}

