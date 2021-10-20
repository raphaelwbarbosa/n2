package br.com.raphaelwitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.raphaelwitter.model.Champions;
import br.com.raphaelwitter.service.ChampService;

@Controller
@RequestMapping("/champs")
public class ChampController {
	@Autowired
	private ChampService champService;
	@GetMapping("/insert")
	public String formInsert(Model model) {
		Champions champ = new Champions();
		model.addAttribute("champs", champ);
		
		return "champs/insert";
	
	}
}
