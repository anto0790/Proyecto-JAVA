package Exceptions;

/**
 * This class creates an empty patient exception that extends to Exception.
 * @author Antonela Diomedi
 *
 */
@SuppressWarnings("serial")
public class EmptyPatientException extends Exception{

	/**
	 * This constructor initializes patient exception.
	 * @param msg is the message emitted by the method that threw the exception.
	 */
	public EmptyPatientException(String msg) {
		super(msg);
	}
	
}
