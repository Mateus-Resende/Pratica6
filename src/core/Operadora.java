package core;

import java.util.HashMap;
import java.util.Map;

import exceptions.UserHasCellphoneException;
import exceptions.UserNotFoundException;

public class Operadora {

	Map<String, String> clienteDados;

	public Operadora(String cpf, String celular) {
		this.clienteDados = new HashMap<>();
		this.clienteDados.put(cpf, celular);
	}

	public Operadora() {
		this(new String(), new String());
	}

	public void excluiCliente(String cpf) throws UserNotFoundException, UserHasCellphoneException {
		String cliente = this.clienteDados.get(cpf);

		if (cliente == null) {
			throw new UserNotFoundException("Usuário inexistente!");
		} else if (!cliente.equals("")) {
			throw new UserHasCellphoneException("Usuário tem celular!");
		}
	}
	public void addCliente(String cpf, String celular) {
		if (cpf != null && !cpf.equals("")) {
			if (celular != null && !celular.equals("")) {
				this.clienteDados.put(cpf, celular);
			} else {
				this.clienteDados.put(cpf, new String());
			}
		}
	}

}
