package adts;
import exceptions.*;
import interfaces.QueueInterface;
import java.lang.StringBuilder;

public class ArrayQ<E> implements QueueInterface<E>{
    protected E[] queue;
    protected int rear = -1;
    protected int front = 0;


    private static final int DEFAULT_LENGTH = 6;

    @SuppressWarnings("unchecked")
    public ArrayQ(){queue = (E[]) new Object[DEFAULT_LENGTH];}
    
    @SuppressWarnings("unchecked")
    public ArrayQ(int length){queue = (E[]) new Object[length];}

    @Override
    public void enqueue(E element) {
        try{
            if(isFull()){
                throw new QueueFullException("Queue is full");
            }
            rear++;
            queue[rear] = element;
        } catch (QueueFullException e){
            e.printStackTrace();
        }

    }
    
    @Override
    public E dequeue() {
        try{
            if(isEmpty()){
                throw new exceptions.QueueEmptyException("Queue is empty");
            }
       
        } catch (exceptions.QueueEmptyException e){
            e.printStackTrace();
        }
          E temp = queue[front];
            queue[front] = null;
            rear--;

            for(int i = queue.length - 1; i >= 0; i--){
                queue[i+1] = queue[i];
            }
            return temp;
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

    @Override
    public boolean isFull() {
        return rear == queue.length -1;
    }

    @Override
    public String toString(){
        if (isEmpty()) return "[]";
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("[");
        
        for(int i = 0; i < queue.length; ++i){
            if(queue[i] != null){
                stringBuild.append(queue[i]);
                if(i < rear){
                    stringBuild.append(", ");
                }
            }
        }
        stringBuild.append("]");
        return stringBuild.toString();
    }
}

