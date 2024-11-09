package priority_queue_week_7.MaxHeap;

public interface PriorityQueueInterface<T>
{

    void enqueue(T element);// adds an element in a queue

    T dequeue(); // dequeues an element

    boolean isFull(); // Returns T/F depending on if array is full

    boolean isEmpty();// Returns T/F depending on if array is empty

    int size(); // returns the size of array


}
