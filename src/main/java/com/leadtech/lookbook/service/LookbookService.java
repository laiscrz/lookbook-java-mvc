package com.leadtech.lookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadtech.lookbook.model.Lookbook;
import com.leadtech.lookbook.repository.LookbookRepository;

@Service
public class LookbookService {
    @Autowired
    private LookbookRepository lookbookRepository;

    public List<Lookbook> listarTodos() {
        return lookbookRepository.findAll();
    }

    public void salvar(Lookbook lookbook) {
        if (lookbook.getId() != null) {
            // Atualizar o Lookbook existente
            lookbookRepository.save(lookbook);
        } else {
            // Criar um novo Lookbook
            lookbookRepository.save(lookbook);
        }
    }


    public Lookbook buscarPorId(Long id) {
        return lookbookRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        lookbookRepository.deleteById(id);
    }
}

