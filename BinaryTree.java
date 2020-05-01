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

    public void PreOrderRecursive(Node current){
        if (current!=null){
        System.out.println(current.value);
        PreOrderRecursive(current.left);
        PreOrderRecursive(current.right);
        }
    }

    public void InOrderRecursive(Node current){
        if (current!=null){
            InOrderRecursive(current.left);
            System.out.println(current.value);
            InOrderRecursive(current.right);
        }
    }

    public void PostOrderRecursive(Node current){
        if (current!=null){
            PostOrderRecursive(current.left);
            PostOrderRecursive(current.right);
            System.out.println(current.value);
            
        }
    }
    public static void main(String[] args){
        BinaryTree tree= new BinaryTree();
        tree.add(5);
        tree.add(6);
        tree.HasElement(5);
        tree.PreOrderRecursive(tree.root);
        tree.InOrderRecursive(tree.root);
        tree.PostOrderRecursive(tree.root);
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
    
      