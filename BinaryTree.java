class BinaryTree{
    Node node;
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }
    }

    public static void Insert(Node root, int value){

        if (root==null){
          root=new Node(value);
        }
        
       else if (value<root.value){
            if (root.left!=null){
                Insert(root.left,value);
            
            }
            else{
                root.left=new Node(value);
            }
            }

        else if (value>root.value){
            if (root.right!=null){
                Insert(root.right,value);
            }
            else{
                root.right=new Node(value);
            }

        }

        }

    
        public static void main(String[] args){
            BinaryTree tree= new BinaryTree();
            Node node=new Node(5);
            tree.Insert(node,5);
        }
    }
