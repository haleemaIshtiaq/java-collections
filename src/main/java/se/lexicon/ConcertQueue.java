package se.lexicon;

import java.util.ArrayDeque;
import java.util.Deque;

//ArrayDeque is chosen because it follows FIFO(first in first out)
//People join at the back and enter the concert from the front
public class ConcertQueue {
    void main(){
        //Create a queue to store people
        Deque<String> people = new ArrayDeque<>();

        //Add six people to the back of the queue
         people.offer("Ali");
        people.offer("Sara");
        people.offer("Ahmed");
        people.offer("Aliya");
        people.offer("John");
        people.offer("Zainab");

        //Print original queue
        IO.println("Original queue: " +people);

        //Remove and print the first two
        IO.println("Entering concert: " +people.poll());
        IO.println("Entering concert: " +people.poll());

        //Print the remaining queue
        IO.println("Remaining queue: " +people);


    }
}
