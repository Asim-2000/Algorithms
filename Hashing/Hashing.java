import java.util.ArrayList;
// One thing to remember in this java code is that we are stroing nodes in array list which is initially composed of 10 empty buckets. //
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
    //Array list is the main hash lsit//
    private ArrayList<HashNode<K,V>> bucketArray;
    // number of buckets is the size of array lsit//
    private int numberofbuckets;
    //size is the total number of nodes in the hash list ( conunting each and every filled node in all bucketarrays)//
    private int size;

    public Map(){

        //bucket array is the main array list of hashnodes and then each hashnode has nodes attached with them creating a linked list of obejcts.
       
        bucketArray=new ArrayList<>();
        //We are having a main hash list of 10 buckets//
        numberofbuckets=10;
        // Size of hashlist is 0 because at first nothing is filled at any place//
        size=0;
        //Initializing first 10 placeholders with null//
        for (int i=0; i<numberofbuckets;i++){
            bucketArray.add(null);
        }
    }
    //method size, it returns the size of the hashmap//
    public int size(){return size;}

    // method isEmpty, it tells whether the hashmap is empty or not//
    public boolean isEmpty(){return size()==0;}

    // method getBucketIndex it will accept key give you a random index (0-9) out of number of buckets in the array list as the index//
    private int getBucketIndex(K key){
        int hashCode=key.hashCode();
        int index = hashCode%numberofbuckets;
        return index;
    }
    //.get methdo retruns a value for a key. There is a difference between this get methdo and the one we call on the array list it is called on hashmap not array list.//
    // this methdo will be used when we will create a hash map adn then we want a value for a particualr key in O(1) or 0(linkedlist) time//
    public V get(K key){
        
        int bucketIndex=getBucketIndex(key);
        HashNode<K,V> head= bucketArray.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public V remove(K key){

        //bucket index is the index of object in the array list retrievd through its key.
        int bucketIndex=getBucketIndex(key);

        // the get method returns the object at the index specified index. in this case we pass the 
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
        
        if (head==null){
            return null;
        }

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
        //Note that we always add the new node in front of the linked list of hashnodes. 
        public void add (K key, V value){

        // first, we will generate index with help of the key//
            int bucketIndex=getBucketIndex(key);
        // Then we will retrieve the box of array list with help of get method and call it head.//
            HashNode<K,V> head= bucketArray.get(bucketIndex);
        // Iterate untill u get an empty node//
            while (head!=null){
        //if there is a node with similar key then return, because no redundancy //
                if (head.key.equals(key)){
                    return;
                }
        //continue iterating
                head=head.next;
            }
        // increase the size of bucket array//
            size++;
            // set head to the first node //
            head=bucketArray.get(bucketIndex);
            // create a new node with the value and key provided//
            HashNode<K,V> newNode= new HashNode<K,V>(key,value);
            // newNode will be the first node in the bucket array therefore set the next of newnode to be the previosuly called head.//
            newNode.next=head;
            //Now the placeholder of the first node the list of hashnodes is the new node//
            bucketArray.set(bucketIndex,newNode);

            //if the load factor i.e (total size of hashmap/ number of buckets in hashmap) exceeds 0.75 then//
            if ((size*1.0)/numberofbuckets>0.75){
                //create a new array list of hashnodes and set it equal to the bucketarray(previous one)//
              ArrayList<HashNode<K,V>> temp = bucketArray;
              //make a new arraylist in bucket array//
              bucketArray=new ArrayList<>();
              size=0;
              //number of bucekts in this new bucketarray is twice now
              numberofbuckets=2*numberofbuckets;
              //initialize the buckets with null//
              for (int i=0;i<numberofbuckets;i++){
                  bucketArray.add(null);
              }
              //For each Node in temp //
              for (HashNode<K,V> headNode:temp){
                //then iterating untill we get a null in that list//  
                while (head!=null){
                    //adding elements of temp in new hashmap//
                    add(headNode.key,headNode.value);
                    headNode=headNode.next;
                }
              }
            }       
        }
public static void main (String[] args){
    Map map=new Map();
    map.add("Asim",99);
    System.out.println(map.get("Asim"));
    map.add("Muhammad",99.9);
    System.out.println(map.get("Muhammad"));

}
    }

