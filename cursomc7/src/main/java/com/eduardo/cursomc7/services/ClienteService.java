package com.eduardo.cursomc7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.cursomc7.domain.Cliente;
import com.eduardo.cursomc7.repositories.ClienteRepository;
import com.eduardo.cursomc7.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto nao Encontrado! Id " + id 
					+ ",Tipo: " + Cliente.class.getName());
		}
		
		return obj;
		
	}
	

}
