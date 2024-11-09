## Priority Queue Interface 9.1 

A priority queue is a `ADT` (Abstract Data Structure) and it serves element based on its importance, or "priority". In a regular queue, elements get served on a FIFO basis. Meaning, `first in, first out,` however this is different in a priority-queue.

A priority queue has a different `accessing protocol` than a regular queue. It prioritizes the most important tasks at hand. 

<hr style = "height: 3.2px; border: none; color:#333; background-color:#333;"/>

### Example Scenario

> **In the example of a company with one IT specialist, how is priority determined for handling IT support requests?**

If you were to take the "chain of command" the occupations on the higher step of the hierarchy would attain the higher priority, hence recieving the IT support first. 

(For example a president of the company would get his request attained to first)

#

Usually in Operating Systems, proccesses are in a queue, mostly these processes have different `accessing protocols.` This is where the OS uses priority queues instead of regular queues. 

Priority Queues are also useful when it comes to **Discrete Event Simulations.** These are scenarios that can happen out of the ordinary, and proper approach and strategezing to handle them in such a way, where the priority queue structure does not get overly ditrupted.   

## Sorting and Handling Data with Priority Queue 

When it comes to priority queue, we can `enqueue` elements, sort them, and proceed by `dequeuing` them in order. Based on this, we can dequeue elements based on our sorted order, whatever order we choose to treat the queue as, whether it is numerical sorting, alphabetical, etc.

> Starvation and Aging 

Starvation is a common problem in priority queues, this is when all the non-priority elements are getting `starved` because other high-priority elements keep arriving.

In order to battle this problem, `aging` an element is an effective solution. Longer an element sits in a queue, more `aged` it becomes, giving it a higher precedence over other lower-priority elements. 

## Priority Queue Interface 

```java
void enqueue (T element); 
// adds element to this queue  

T dequeue (); 
// removes the highest priority element from this priority queue and returns it 

boolean isEmpty ();
boolean isFull  ();

int size ();
// returns the number of elements in this priority queue

```

## Priortiy Queue Implementations 

#### Unsorted Array 

`enqueue` an element is O(1) operation, simply add it at the end of the array

`dequeue` an element is O(n) operation, must traverse through entire array, find element and then perform the operation 

#### Sorted Array

`enqueue` would be an O(n) operation, finding the correct spot can be done using `binary search` which is O(log2N), and shifting elements is O(n)

`dequeue` would be an O(1) operation, simply return the last element (largest) from the array.


##### Comparator Return Values 

```
Negative Value (< 0): The first object is considered less than the second object.

Zero (0): The two objects are considered equal.

Positive Value (> 0): The first object is considered greater than the second object.
```


### Heap

Heap is an implementation of a `priority queue,` and it uses a `binary tree` as its data structure


> Binary Tree 

*   Can have at most two children
*   Tree is made of nodes 
*  Can not have more than two children 
* Must have a single root, only one path must be taken to a root, can not be circular 
* Nodes must be connected to the root, there has to be a `unique` path to get to the root node. 


> Full Tree

Full tree is a `binary tree`

Tree is filled from top to bottom, left to right, each node has two children, and the height of the tree is `filled completely` 

Full tree is also considered a complete tree

> Complete Tree 

Complete tree is a `binary tree`

Tree is filled from top to bottom, left to right, however a complete tree can never be a full tree. Complete tree does not have all of its leveled completely filled.

#### Heap Properties and Forumlas 

i. **Shape Property:** This means that the tree must be a complete binary tree 

ii. **Order Property:** Each parent is greater than or equal to its children. 

iii. **Left Child** -> `i * 2 + 1 = leftChild`

iv. **Right Child** -> `i * 2 + 2 = rightChild`

v. **Parent** -> `i - 1 / 2 = parent`


<hr style = "height: 3.2px; border: none; color:#333; background-color:#333;"/>


The number of nodes at a specific height \( h \) in a binary tree is given by:

$$
\text{Nodes at height } h = 2^h
$$

The total number of nodes from height \( 0 \) up to a given height \( h \) is:

$$
\text{Total nodes up to height } h = 2^{h+1} - 1
$$


<hr style = "height: 3.2px; border: none; color:#333; background-color:#333;"/>
