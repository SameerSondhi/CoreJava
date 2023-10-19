package TheQueue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
      LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.add(new Person("Ali", 18));
        linkedList.listIterator();
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek()); // First element
        System.out.println(supermarket.poll()); // Removes first element
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
