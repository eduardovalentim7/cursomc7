package com.eduardo.cursomc7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.eduardo.cursomc7.domain.Categoria;
import com.eduardo.cursomc7.repositories.CategoriaRepository;
import com.eduardo.cursomc7.services.exceptions.DataIntegrityException;
import com.eduardo.cursomc7.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
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
	
	public Categoria update(Categoria obj) {
		//Categoria newObj=find(obj.getId());
		//updateData(newObj,obj);
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try 
		{
			repo.delete(id);
		}
		catch (DataIntegrityViolationException e){
			///excessao personalizada 
			throw new DataIntegrityException("Não é possivel excluir uma categoria que contém produtos");
		}
		
	}


}
