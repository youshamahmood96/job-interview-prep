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
    public List<Integer> bfs(){
        ArrayList<Integer> visited = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right!= null){
                queue.add(current.right);
            }
            visited.add(current.value);
        }
        return visited;
    }
}
