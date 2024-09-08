package com.leadtech.lookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leadtech.lookbook.model.ClothingItem;
import com.leadtech.lookbook.service.ClothingItemService;

@Controller
public class ClothingItemController {
	@Autowired
	private ClothingItemService clothingItemService;

	@GetMapping("/clothing")
	public ModelAndView listarPecas() {
		ModelAndView mv = new ModelAndView("clothing/list");
		mv.addObject("clothingItems", clothingItemService.listarTodos());
		return mv;
	}

	@GetMapping("/clothing/novo")
	public ModelAndView novoForm() {
		ModelAndView mv = new ModelAndView("clothing/form");
		mv.addObject("clothingItem", new ClothingItem());
		return mv;
	}

	@PostMapping("/clothing")
	public ModelAndView salvar(@ModelAttribute ClothingItem clothingItem) {
		clothingItemService.salvar(clothingItem);
		return new ModelAndView("redirect:/clothing");
	}

	@GetMapping("/clothing/editar/{id}")
	public ModelAndView editarForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("clothing/form");
		mv.addObject("clothingItem", clothingItemService.buscarPorId(id));
		return mv;
	}

	@GetMapping("/clothing/deletar/{id}")
	public ModelAndView deletar(@PathVariable Long id) {
		clothingItemService.deletar(id);
		return new ModelAndView("redirect:/clothing");
	}
	
    @GetMapping("/clothing/detalhes/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("clothing/details");
        mv.addObject("clothingItem", clothingItemService.buscarPorId(id));
        return mv;
    }
}
