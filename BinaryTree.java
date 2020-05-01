class BinaryTree{
    Node root;
    
    private Node Insert(Node current, int value){
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

    private boolean ContainsElement(Node current, int value){
        if (current==null){
            return false;
        }
        else if (current.value==value){
            return true;
        }
        return value>current.value ? ContainsElement(current.right,value) : ContainsElement(current.left,value);
    }

    public boolean HasElement (int value){
        return ContainsElement(root,value);
    }

    public void InOrder(Node current){
        

    }
    public static void main(String[] args){
        BinaryTree tree= new BinaryTree();
        tree.add(5);
        tree.add(6);
        tree.HasElement(5);
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
    
      