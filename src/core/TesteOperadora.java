package core;

import exceptions.UserHasCellphoneException;
import exceptions.UserNotFoundException;

public class TesteOperadora {

	public static void main(String[] args) {
		Operadora op = new Operadora();
		
		op.addCliente("123456789-00", "123541345");
		op.addCliente("123654987-00", "");
		
		try {
			op.excluiCliente("123654987-00");
			System.out.println("Cliente 123654987-00 Excluído com sucesso!");
		} catch (UserNotFoundException | UserHasCellphoneException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			op.excluiCliente("123456789-00");
			System.out.println("Cliente 123456789-00 excluído com sucesso!");
		} catch (UserNotFoundException | UserHasCellphoneException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			op.excluiCliente("000000000-00");
			System.out.println("Cliente 000000000-00 excluído com sucesso!");
		} catch (UserNotFoundException | UserHasCellphoneException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nTerminado!");
		
	}

}
