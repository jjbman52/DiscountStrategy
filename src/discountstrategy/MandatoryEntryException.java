/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author jordanrehbein
 */
public class MandatoryEntryException extends IllegalArgumentException{
    private final static String MESSAGE = "Your entry is invalid.";
    
    public MandatoryEntryException() {
        super(MESSAGE);
    }

    public MandatoryEntryException(String message) {
        super(MESSAGE);
    }

    public MandatoryEntryException(String message, Exception cause) {
        super(MESSAGE);
    }

    public MandatoryEntryException(Throwable cause) {
        super(cause);
    }
}
