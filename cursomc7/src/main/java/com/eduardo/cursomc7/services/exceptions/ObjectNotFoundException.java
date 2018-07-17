package com.eduardo.cursomc7.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	//Construtor 
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	//Construtor sobrecarga
	public ObjectNotFoundException(String msg,Throwable cause) {
		super(msg,cause);
	}
}
