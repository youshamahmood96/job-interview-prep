## SQL

B+ trees used usually in RDBMS.
instead of having only 2 children, each node can have m children.

Each node has `m-1` key/value pair

[B+ tree image](https://www.researchgate.net/profile/Ngu-Huynh/publication/319966450/figure/fig1/AS:779403629953024@1562835714067/Example-of-B-tree-with-branching-factor-equal-3.gif)

Data is only stored on the leaf nodes. The parent nodes only help us to get to the leaf nodes.

Leaf nodes are sorted in a linked list fashion.

RDBMS are ACID complient

A- atomicity, C-consistency, I-Isolation, D-Durability

## No SQL
