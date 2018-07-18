package com.eduardo.cursomc7.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.cursomc7.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {	
	
	

}
