/**
 * Created by Sun Davey on 4/16/2017.
 */
public class queueDemo {
    public static void main(String [] args)
    {
        queue myQueue = new queue();

        System.out.println("Is the queue empty? "+myQueue.empty());

        for(int i = 0; i < 6; i++)
        {
            myQueue.queue(i);
        }
        System.out.println("Size of the queue: " +myQueue.size());
        System.out.println("The dequeued number: " +myQueue.dequeue());
        System.out.println("Size of the queue: " +myQueue.size());
        System.out.println("Is the queue empty? " +myQueue.empty());

    }
}
