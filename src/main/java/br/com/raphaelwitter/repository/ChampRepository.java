package br.com.raphaelwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.raphaelwitter.model.Champions;
@Repository
public interface ChampRepository extends CrudRepository<Champions, Integer>{
	
}
