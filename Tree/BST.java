public class BST {
    Node root = null;
    public void insert(int val){
        Node newNode = new Node(val);
        if(this.root == null){
            this.root = newNode;
        }
        else{
            Node current = this.root;
            while(true){
                if(val > current.value){
                    if(current.right == null){
                        current.right = newNode;
                        break;
                    }
                    else{
                        current = current.right;
                    }
                }
                else if(val < current.value){
                    if(current.left == null){
                        current.left = newNode;
                        break;
                    }
                    else{
                        current = current.left;
                    }
                }
                else{
                    break;
                }
            }
        }
    }
    public Node find(int val){
        if(this.root==null){
            return null;
        }
        if(this.root.value == val){
            return this.root;
        }
        Node current = root;
        while(current != null){
            if(val<current.value){
                current = current.left;
            }
            else if(val> current.value){
                current = current.right;
            }
            else{
                return current;
            }
        }
        return null;
    }
}
