package br.com.raphaelwitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raphaelwitter.model.Champions;

import br.com.raphaelwitter.repository.ChampRepository;

@Service
public class ChampService {
	@Autowired
	private ChampRepository champRepository;

	public Champions insert(Champions champ) {
		return champRepository.save(champ);
	}
}