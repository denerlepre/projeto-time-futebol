package com.time.TimeFutebol.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.time.TimeFutebol.entity.Jogador;
import com.time.TimeFutebol.repositories.TimeRepository;

@RestController
@RequestMapping("/times")
public class TimeController {
	
	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping
	public List<Jogador> lista() {
		return timeRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Jogador> findById(@PathVariable Long id) {
		return timeRepository.findById(id);
		
	}
	
	@GetMapping("/buscarPorNome")
    public List<Jogador> buscarPorNome(@RequestParam("nome") String nome) {
        return timeRepository.findByNomeContaining(nome);
    }
			
		
	
	
	
	
	/*@GetMapping(value = "buscarPorNome")
	@ResponseBody
	public ResponseEntity<List<Jogador>> buscarPorNome(@RequestParam(name = "nome") String nome) {
		
		List<Jogador> jogador = timeRepository.buscarPorNome(nome);
		return new ResponseEntity<List<Jogador>>(jogador, HttpStatus.OK);
	}*/
	
	
	

}
