public class LinkedList{
    static Node head;

   static class Node{
        int data;
        Node next;

       Node(int d){
           data=d;
       }
    }
    public static LinkedList insert(LinkedList list,int data){
        Node new_node= new Node(data);
        new_node.next=null;
        if (head==null){
            head=new_node;
        }
        else{
            Node reach_to_last= LinkedList.head;
            while (reach_to_last.next!=null){
                reach_to_last=reach_to_last.next;

            }
            reach_to_last.next=new_node;

        }

        return list;
    }

    public static LinkedList remove(LinkedList list,int key){
        Node current_node=list.head, previous=null;
        if (current_node!=null & current_node.data==key){
            list.head=current_node.next;
            return list;
        }

        while(current_node!=null | current_node.data!=key){
            previous=current_node;
            current_node=current_node.next;
            }
        if (current_node!=null){
            previous.next=current_node.next;
            
        }
        if (current_node==null){
            System.out.println("Not found");
            
        }

        return list;

        }
        
    
public static void main(String[] args){
    LinkedList list = new LinkedList();
    list=insert(list,5);
    list=remove(list,5);

}

}