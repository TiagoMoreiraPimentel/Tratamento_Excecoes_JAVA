package Exceptions;

/*
 * Classe responsavel por personalizar o tratamento de exceções, contendo as mensagens 
 * armazenadas na variavel 'mgs'.
 */
public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BusinessException(String msg) {
		super(msg);
	}

}
