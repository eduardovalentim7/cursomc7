package com.eduardo.cursomc7.services.exceptions;

public class DataIntegrityException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	//Construtor 
	public DataIntegrityException(String msg) {
		super(msg);
	}

	//Construtor sobrecarga
	public DataIntegrityException(String msg,Throwable cause) {
		super(msg,cause);
	}
}
