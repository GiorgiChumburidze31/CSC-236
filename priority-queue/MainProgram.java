package priority_queue_week_7.MaxHeap;

public class MainProgram
{
    public static void main(String[] args)
    {

    HeapPriQ <String> pq = new HeapPriQ<>();

    pq.enqueue("A");
    pq.enqueue("B");
    pq.enqueue("C");

    pq.printArray();

    pq.dequeue();

    pq.printArray();

    }
}
