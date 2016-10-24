package exceptions;

public class UserHasCellphoneException extends Exception{

	private static final long serialVersionUID = 1L;

	public UserHasCellphoneException(String message) {
		super(message);
	}
}
