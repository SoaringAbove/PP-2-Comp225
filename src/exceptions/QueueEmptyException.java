package exceptions;

public class QueueEmptyException extends Exception {
     public QueueEmptyException() {
         super("Stack is empty");
     }
}
