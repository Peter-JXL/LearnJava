import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("apple");
    q.offer("banana");
    q.offer("pear");
    System.out.println(q.poll()); //apple
    System.out.println(q.poll()); //banana
    System.out.println(q.poll()); //pear
    System.out.println(q.poll()); //null


    q.offer("apple");
    System.out.println(q.peek()); //apple
    System.out.println(q.peek()); //apple
    System.out.println(q.peek()); //apple
  }
}
