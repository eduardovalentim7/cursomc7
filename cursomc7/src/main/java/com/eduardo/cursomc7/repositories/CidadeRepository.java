package com.eduardo.cursomc7.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.cursomc7.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {	
	
	

}
