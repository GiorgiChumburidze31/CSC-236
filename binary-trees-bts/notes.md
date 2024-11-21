# Binary Search Tree


* Used to maintain a sorted list 

* LinkedList Implementation & Array Implementation 

* A tree in which each node is capable of having wto child nodes only 

## Definitions 

**Tree:** Tree is a non linear data structure, with an unique starting node that has n number of successors, this data structure must have a unique path to its nodes. 

**Root:** Top node/element of a tree structure, without a predecessor.  

**Parent Node:** is a predecessor of a node. (Parent of a node)

**Subtree:** smaller sets of trees given in a bigger tree. Can have left subtree, right subtree, etc. 

**Ancestor:** A parent of a node

**Descendant:** A child of a node

**Leaf:** A node without children

**Interior Node:** A node that is not a leaf and has at LEAST one child 

**Siblings:** nodes with the same parent (on the same level on the tree)

**Level:** the distance from the root to the given node (number of connections (arrows) between itself and the root)

**Height:** The maximum level of the tree where a node/s are contained 

## Tree Requirements 
To be a valid tree,  is that it's subtree must be disjointed, and it must have a unique path to each node.


## Tree Traversals

#### Breatdth First Traversal

Any time you encounter an element save it or, print it. Goal is to go through the tree from top to bottom, left to right and find each and every node. 

`uses priority queue approach`

#### Depth First Traversal

Find the deepest level in the tree at first, then you go back up and explore if there are other children. Keep checking for parent, and if it has children. (Back Tracking)

`Uses stack based approach` 

### Left Subtree 

All the values in the left subtree are less than or equal to the value in the root node 

### Right Subtree 

All the values in the right subtree are greater or equal to the value in the root node 

QUESTIONABLE GO BAKCK TO SLIDES FOR THIS!

## Binary Tree Traversals 

Everytime you hit a subtree be sure to apply the rules of traversal to that subtree 

* Preorder Traversal
```sh
visit the root 
visit the left/most subtree 
visit the righ/tmost subtree
```
* Inorder Traversal 
```sh
visit the left/most subtree 
visit the visit the root  
visit the right/most subtree
```
* Postorder Traversal
```sh
visit the left/most subtree  
visit the right/most subtree 
visit the root 
```

*Exam Question, perfrorm all three traversals in a given tree*


#### Binary Search Tree `ADD` method

After inserting the element, compare it to the current node, if it is less, insert at left, if it is greater, insert to the right. 
