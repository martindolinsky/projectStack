package sk.itsovy.dolinsky.exception;

/**
 * @author Martin Dolinsky
 */
public class QueueUnderFlowException extends Exception {
	public QueueUnderFlowException(String message) {
		super(message);
	}
}
