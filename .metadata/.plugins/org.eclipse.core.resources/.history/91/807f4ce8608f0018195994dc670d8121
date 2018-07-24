package com.eduardo.cursomc7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.cursomc7.domain.Categoria;
import com.eduardo.cursomc7.repositories.CategoriaRepository;
import com.eduardo.cursomc7.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto nao Encontrado! Id " + id 
					+ ",Tipo: " + Categoria.class.getName());
		}
		
		return obj;
		
	}
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

}
