import java.util.ArrayList;
// HashNode is a class in which we have three attributes a key (name or any other object), value( what is value? like in dictionary?) and a node that points to next obejct in the list.
class HashNode<K,V>{
    K key;
    V value;
    HashNode<K,V> next;

    public HashNode(K key, V value){
        this.key=key;
        this.value=value;

    }
}

class Map <K,V>{

    private ArrayList<HashNode<K,V>> bucketArray;

    private int numberofbuckets;
    private int size;

    public Map(){
        // bucket array is the array we have attached to the node of the hashmap to save items that have same key bcz multiple items can have the same key so we maintain//
        // a linked lsit infronf of the node and iterate through it to retrive the correct obejct //
       
        bucketArray=new ArrayList<>();
        numberofbuckets=10;
        size=0;

        for (int i=0; i<numberofbuckets;i++){
            bucketArray.add(null);
        }
    }

    public int size(){return size;}

    public boolean isEmpty(){return size()==0;}

    private int getBucketIndex(K key){
        int hashCode=key.hashCode();
        int index = hashCode%numberofbuckets;
        return index;
    }

    public V remove(K key){

        int bucketIndex=getBucketIndex(key);
        
        HashNode<K,V> head =bucketArray.get(bucketIndex);

        HashNode<K,V> prev =null;
        // iterate through the array list of buckets untill we reach the end of list// 
        while (head!=null){
            if (head.key.equals(key)){
                break;
            }
            prev=head;
            head=head.next;
            }
        
        if (head==null){return null;}

        size--;
        // if previous node is not null then we will point the previous node to the node on the next of head. //
        if (prev!=null){
            prev.next=head.next;
        }

        //else we will replace the object i.e node at the bucketIndex with the objcet at the next position.//
        else{
            bucketArray.set(bucketIndex,head.next);
        }
        
        return head.value;
        // Is the next element replicated? Check  //


        }        

    }

