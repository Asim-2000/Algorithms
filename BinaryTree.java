class BinaryTree{
    Node node;
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }
    }

    public static void Insert(Node node, int value){

        if (node==null){
            Node new_node=new Node(value);
        }
        
       else if (value<new_node.value){
            if (node.left!=null){
                Insert(node.left,value);
            
            }
            else{
                node.left=new Node(value);
            }
            }

        else if (value>node.value){
            if (node.right!=null){
                Insert(node.right,value);
            }
            else{
                node.right=new Node(value);
            }
        }

        }

    
        public static void main(String[] args){
            BinaryTree tree= new BinaryTree();
            tree.insert(new_node,5);
        }
    }
