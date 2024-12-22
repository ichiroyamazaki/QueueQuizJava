import java.util.Queue;

import java.util.LinkedList;

public class QueueQuiz {

    public static void main (String [] args) {

        Queue beverages = new LinkedList();

        beverages.offer("Juice");

        beverages.offer("Iced Tea"); //enqueue Iced Tea without using add()

        System.out.println(beverages.peek() + " is queued first.");

        beverages.poll(); //dequeue Iced Tea without using remove()

        System.out.println("Element(s) in the queue: " + beverages);

    }

}
