package apps;
/* 
 
 You must write 12 test cases:
three for the enqueue
three for the dequeue
two each for the isEmpty, isFull, and toString operations
Each test case will state which operation is to be performed and the state of the test queue prior to the execution of the operation. For the enqueue and dequeue, the test case will state the expected state of the queue after the operation is executed. For all operations other than the enqueue, the test case will state the expected return value.
 */
import adts.ArrayQ;

public class testCases {
    public static void main(String[] args){
        //Case 1:
        System.out.println("Test Case 1: IsEmpty() method");
        ArrayQ<Integer> queue1 = new ArrayQ<>(5);
        System.out.println("Initial State: " + queue1.toString());
        System.out.println("Operation: isEmpty()");
        System.out.println("Expected Return Value: true");
        System.out.println("Actual Return Value: " + queue1.isEmpty() + "\n");

        //Case 2:
        System.out.println("Test Case 2: IsEmpty() method");
        ArrayQ<Integer> queue2 = new ArrayQ<>(5);
        queue2.enqueue(10);
        queue2.enqueue(234);
        queue2.enqueue(67);
        System.out.println("Initial State: " + queue2.toString());
        System.out.println("Operation: isEmpty()");
        System.out.println("Expected Return Value: false");
        System.out.println("Actual Return Value: " + queue2.isEmpty() + "\n");

        //Case 3:
        System.out.println("Test Case 3: IsFull() method");
        ArrayQ<Integer> queue3 = new ArrayQ<>(3);
        queue3.enqueue(1);
        queue3.enqueue(2);
        queue3.enqueue(3);
        System.out.println("Initial State: " + queue3.toString());
        System.out.println("Operation: isFull()");
        System.out.println("Expected Return Value: true");
        System.out.println("Actual Return Value: " + queue3.isFull() + "\n");

        //Case 4:
        System.out.println("Test Case 4: IsFull() method");
        ArrayQ<Integer> queue4 = new ArrayQ<>(5);
        queue4.enqueue(10);
        queue4.enqueue(20);
        System.out.println("Initial State: " + queue4.toString());
        System.out.println("Operation: isFull()");
        System.out.println("Expected Return Value: false");
        System.out.println("Actual Return Value: " + queue4.isFull() + "\n");

        //Case 5:
        System.out.println("Test Case 5: enqueue() method");
        ArrayQ<Integer> queue5 = new ArrayQ<>(4);
        System.out.println("Initial State: " + queue5.toString());
        System.out.println("Operation: enqueue(5)");
        queue5.enqueue(5);
        System.out.println("Expected State: [5]");
        System.out.println("Actual State: " + queue5.toString() + "\n");

        //Case 6: 
        System.out.println("Test Case 6: enqueue() method");
        ArrayQ<Integer> queue6 = new ArrayQ<>(3);
        queue6.enqueue(1);
        queue6.enqueue(2);
        System.out.println("Initial State: " + queue6.toString());
        System.out.println("Operation: enqueue(3)");
        queue6.enqueue(3);
        System.out.println("Expected State: [1, 2, 3]");
        System.out.println("Actual State: " + queue6.toString() + "\n");

        //Case 7:
        System.out.println("Test Case 7: enqueue() method");
        ArrayQ<Integer> queue7 = new ArrayQ<>(2);
        queue7.enqueue(1);
        queue7.enqueue(2);
        System.out.println("Initial State: " + queue7.toString());
        System.out.println("Operation: enqueue(3)");
        System.out.println("Expected State: QueueFullException");
        System.out.print("Actual State: ");
        queue7.enqueue(3);
        System.out.println("\n");

        //Case 8:
        System.out.println("Test Case 8: dequeue() method");
        ArrayQ<Integer> queue8 = new ArrayQ<>(4);
        queue8.enqueue(10);
        queue8.enqueue(20);
        queue8.enqueue(30);
        System.out.println("Initial State: " + queue8.toString());
        System.out.println("Operation: dequeue()");            
        System.out.println("Expected Return Value: 10");
        System.out.println("Actual Return Value: " + queue8.dequeue());
        System.out.println("Expected State: [20, 30]");
        System.out.println("Actual State: " + queue8.toString() + "\n");

        //Case 9:
        System.out.println("Test Case 9: dequeue() method");
        ArrayQ<Integer> queue9 = new ArrayQ<>(3);
        queue9.enqueue(100);
        System.out.println("Initial State: " + queue9.toString());
        System.out.println("Operation: dequeue()");
        System.out.println("Expected Return Value: 100");
        System.out.println("Actual Return Value: " + queue9.dequeue());
        System.out.println("Expected State: []");
        System.out.println("Actual State: " + queue9.toString() + "\n");
        //Case 10:
        System.out.println("Test Case 10: dequeue() method");
        ArrayQ<Integer> queue10 = new ArrayQ<>(2);
        System.out.println("Initial State: " + queue10.toString());
        System.out.println("Operation: dequeue()");
        System.out.println("Expected Return Value: QueueEmptyException");
        System.out.print("Actual Return Value: ");
        queue10.dequeue();
        System.out.println("\n");

        //Case 11:
        System.out.println("Test Case 11: toString() method");
        ArrayQ<Integer> queue11 = new ArrayQ<>(3);
        System.out.println("Initial State: " + queue11.toString());
        System.out.println("Operation: toString()");
        System.out.println("Expected Return Value: []");
        System.out.println("Actual Return Value: " + queue11.toString() + "\n");

        //Case 12:
        System.out.println("Test Case 12: toString() method");
        ArrayQ<Integer> queue12 = new ArrayQ<>(4);
        queue12.enqueue(7);
        queue12.enqueue(14);
        queue12.enqueue(21);
        System.out.println("Initial State: " + queue12.toString());
        System.out.println("Operation: toString()");
        System.out.println("Expected Return Value: [7, 14, 21]");
        System.out.println("Actual Return Value: " + queue12.toString() + "\n");
    }
}
