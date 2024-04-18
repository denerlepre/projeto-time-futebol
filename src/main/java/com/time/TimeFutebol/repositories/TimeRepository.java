package com.time.TimeFutebol.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.time.TimeFutebol.entity.Jogador;

@Repository		
public interface TimeRepository extends JpaRepository<Jogador, Long> {
	
	    List<Jogador> findByNomeContaining(String nome);
	
}