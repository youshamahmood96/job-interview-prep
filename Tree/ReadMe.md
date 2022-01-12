# What is a tree?
A data structure which consists of nodes, and they are in a parent child relationship

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Tree_%28computer_science%29.svg/220px-Tree_%28computer_science%29.svg.png" />

Tree is different from other data structures, as they are **non-linear**. Other data strcutures, like arrays, lists, stack, queues etc have one dimensional data formation.

# Terminologies

- **Root**: The topmost node in a tree.Also known as **Key**
- **Child**: A node directly connected to another node when moving away fron the root
- **Parent**: The converse notion of a child
- **Siblings**: A group of nodes with the same parent
- **Leaf**: A node with no children
- **Edge**: Connection between nodes in a tree.

<img src="https://miro.medium.com/max/975/1*PWJiwTxRdQy8A_Y0hAv5Eg.png" />

# Rules for forming a proper tree

- A node can only point to a chld. It cannot point to parent/siblings.
- A tree has only one **root**

# Examples of trees

- HTML DOM
- Network Routing
- Abstract syntax trees
- Artifical intelligence
- Folders in OS

# Kinds of trees

- **Trees**
- **Binary Trees**
- **Binary Search Trees**

# Rules for forming binary search trees

- A parent can only have two children
- the leftnode is always lesser than the parent
- the rightnode is always greater than the parent

# Breadth First Search (BFS)

- Create a queue (could be any data structure, I used the queue data structure) and a variable to store the values of the nodes visited
- Place the root node in the queue
- Loop as long as there is anything in the queue

During the loop,

- Dequeue a node from the queue and push the value of the node into the variable that stores the nodes
- If there is a left property on the node dequeued, add it to the queue
- If there is a right property on the node dequed, add it to the queue

finally, return the variable that stores the nodes

# Depth First Search Preorder (DFSPreOrder)

- Implement a method, which will take in a node
- This method will first check whether the node is **null** . If so, it will return immediately;
- If not, it will call itself recursively. The recursive call will be divided into two parts.
- At first it will check for left nodes, if  it finds that, it will keep on traversing through the left part
- It will also check for right nodes, and keep on traversing through the right part
- We will just print out all the nodes, as they traverse.
- Call this metho with input as the root of the binary tree.
