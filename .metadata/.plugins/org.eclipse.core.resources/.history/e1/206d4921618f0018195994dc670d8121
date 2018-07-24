package com.eduardo.cursomc7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.cursomc7.domain.Pedido;
import com.eduardo.cursomc7.repositories.PedidoRepository;
import com.eduardo.cursomc7.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto nao Encontrado! Id " + id 
					+ ",Tipo: " + Pedido.class.getName());
		}
		
		return obj;
		
	}
	

}
