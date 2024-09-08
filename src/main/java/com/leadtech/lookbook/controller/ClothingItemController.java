package com.leadtech.lookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leadtech.lookbook.model.ClothingItem;
import com.leadtech.lookbook.model.ListaCategoria;
import com.leadtech.lookbook.model.ListaPadrao;
import com.leadtech.lookbook.model.ListaSazonalidade;
import com.leadtech.lookbook.model.ListaTamanho;
import com.leadtech.lookbook.service.ClothingItemService;

import jakarta.validation.Valid;

@Controller
public class ClothingItemController {
    
    @Autowired
    private ClothingItemService clothingItemService;

    // Listar todas as peças de roupa
    @GetMapping("/clothing")
    public ModelAndView listarPecas() {
        ModelAndView mv = new ModelAndView("clothing/list");
        mv.addObject("clothingItems", clothingItemService.listarTodos());
        return mv;
    }

    // Exibir formulário para criar uma nova peça de roupa
    @GetMapping("/clothing/novo")
    public ModelAndView novoForm() {
        ModelAndView mv = new ModelAndView("clothing/form");
        mv.addObject("clothingItem", new ClothingItem());
        return mv;
    }

    // Salvar a nova peça de roupa ou as alterações feitas
    @PostMapping("/clothing")
    public ModelAndView salvar(@Valid @ModelAttribute ClothingItem clothingItem, BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("clothing/form"); // Formulário com mensagens de erro
        }
        clothingItemService.salvar(clothingItem);
        return new ModelAndView("redirect:/clothing"); // Redireciona para a listagem
    }

    // Exibir o formulário para editar uma peça de roupa existente
    @GetMapping("/clothing/editar/{id}")
    public ModelAndView editarForm(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("clothing/form");
        mv.addObject("clothingItem", clothingItemService.buscarPorId(id));
        return mv;
    }

    // Deletar uma peça de roupa pelo ID
    @GetMapping("/clothing/deletar/{id}")
    public ModelAndView deletar(@PathVariable Long id) {
        clothingItemService.deletar(id);
        return new ModelAndView("redirect:/clothing");
    }

    // Exibir detalhes de uma peça de roupa específica
    @GetMapping("/clothing/detalhes/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("clothing/details");
        mv.addObject("clothingItem", clothingItemService.buscarPorId(id));
        return mv;
    }

    // Popula as categorias no model de todos os métodos
    @ModelAttribute("categorias")
    public ListaCategoria[] getCategorias() {
        return ListaCategoria.values();
    }

    // Popula os tamanhos no model de todos os métodos
    @ModelAttribute("tamanhos")
    public ListaTamanho[] getTamanhos() {
        return ListaTamanho.values();
    }

    // Popula as sazonalidades no model de todos os métodos
    @ModelAttribute("sazonalidades")
    public ListaSazonalidade[] getSazonalidades() {
        return ListaSazonalidade.values();
    }

    // Popula os padrões no model de todos os métodos
    @ModelAttribute("padroes")
    public ListaPadrao[] getPadroes() {
        return ListaPadrao.values();
    }
}
