public class LinkedList{
    static Node head;

   static class Node{
        int data;
        Node next;

       Node(final int d){
           data=d;
       }
    public static LinkedList insert(LinkedList list,int data){
        final Node new_node= new Node(data);
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


    }

    
public static void main(final String[] args){
    LinkedList a = new LinkedList();
    

}

}