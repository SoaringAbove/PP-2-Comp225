package exceptions;

public class QueueFullException extends Exception {
    public QueueFullException() {
         super("Stack is empty");
     }
}
