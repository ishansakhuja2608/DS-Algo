for every node, keys in the left are smaller and keys in the right side are greater.
All keys are considered as distinct.
It is a linked data structure like linked list.
Floor in BST: - Given the root of a BST and a key x, we need to find the floor of that given key in BST, we need to find out closest smaller or equal to value, if the value is present, we return the node with that value, if not present, we need to find out the largest value smaller than the given value and if there's no smaller value than the given value, we return null

AVL Tree: It is a self balancing BST, it maintains the height balance, the difference between the left subtree and right subtree should not exceed 1, this difference in also known as balance factor Balance Factor = |left height - right height|
AVL Tree operations:
-Performs normal BST operations
-Traverse all the ancestors of the newly inserted rows from node to root
-IF found an unbalanced node, check for any of the below cases
--left left // single rotation
--right right // single rotation
--left right // double rotation
--right left // double rotation

Red Black Tree: It is also a self balancing BST, 
-Every Node is either Red or Black
-Root is always black
-No two consecutive Red
-Number of black nodes from every node to all of its descandent leaves should be same