class BinaryTree{
    Node root;
    
    public Node Insert(Node current, int value){
        if (current==null){
         return new Node(value);
        }
        
       else if (value<root.value){
        current.left=Insert(current.left,value);
            }

        else if (value>root.value){
            current.right=Insert(current.right,value);
            }
        else{
            return current;
        }

        return current;

        }
       
    public void add(int value){
        root=Insert(root,value);
    }
    public static void main(String[] args){
        BinaryTree tree= new BinaryTree();
        tree.add(5);
        tree.add(6);
    }
        }

class Node{
    int value;
    Node left;
    Node right;
    
    Node(int value){
      this.value=value;
      this.left=null;
      this.right=null;
        }
       
        }
    
      