// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package observer;

/**
 *
 * @author csiebler
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Text >");
 
        // Create an event source - reads from stdin
        final EventSource eventSource = new EventSource();
 
        // Create Observers
        final ResponseHandler handler1 = new ResponseHandler();
        final ResponseHandler handler2 = new ResponseHandler();
 
        // Subscribe the observer to the event source
        eventSource.addObserver(handler1);
        eventSource.addObserver(handler2);
 
        // Starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }
    
}
