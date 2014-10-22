// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author csiebler
 */
public class ResponseHandler implements Observer {

    private String resp;

    /**
     * 
     * @param obj
     * @param arg 
     */
    @Override
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp);
        }
    }
    
}
