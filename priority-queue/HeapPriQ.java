package priority_queue_week_7.MaxHeap;

import java.util.ArrayList;

public class HeapPriQ <T> implements PriorityQueueInterface <T>
{
    protected ArrayList <T> elements;

    public HeapPriQ ()
    {
        elements = new ArrayList<>();
    }


    @Override
    public void enqueue(T element)
    // ----------------------------------------------------------------
    // Method Description:
    // The following method enqueues an element at the end of the array
    // calls heapifyUp in order to maintain shape and order property
    // ----------------------------------------------------------------
    {
        elements.add(element);
//      heapifyUp(element);
    }

    @Override
    public T dequeue()
    // ---------------------------------------------------------------------
    // Method Description:
    // Removes the root element, and returns it
    // Removed element (root) gets replaced by the last element in the array
    // After replacement, we heapify down
    // ---------------------------------------------------------------------
    {
        // return first element in the array

        T root = elements.getFirst();
        T lastElement = elements.getLast();

        int rootIndex = elements.indexOf(root);
        int lastIndex = elements.indexOf(lastElement);

        // change the structure, replace the root index, with last index
        elements.set(rootIndex, lastElement);
        elements.remove(lastIndex);




        return root;

    }

    //public void heapifyUp (T element)
    // -----------------------------------------------------------------------------
    // Method Description:
    // The following method bubbles up the newly enqueued element
    // compares the element to its parent
    // swap is made as long as the newly enqueued element is greater than its parent
    //------------------------------------------------------------------------------
    //{

    //}
    //public void heapifyDown (T element)
    // --------------------------------------------------------------------------------------
    // Method Description:
    // The following method bubbles down the newly assigned root after the dequeue operation
    // compares the new root to each child.
    //
    //
    // ---------------------------------------------------------------------------------------
    //{



    //}

    @Override
    public boolean isFull()
    {
        return false; // arraylist can never be full
    }

    @Override
    public boolean isEmpty()
    {
        return elements.isEmpty();
    }

    @Override
    public int size()
    {
        return elements.size();
    }
    public void printArray ()
    {
        for (T element : elements)
            System.out.print(element + " ");
        System.out.println();
    }
}
