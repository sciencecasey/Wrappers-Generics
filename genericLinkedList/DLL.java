package genericLinkedList;
 //Class for Doubly Linked List 
/**
 * @author Geeks4Geeks modified by Casey Jayne
 *
 * @param <T>
 */
public class DLL <T>{
      //create a node which is the head of list
   private Node<T> head;
   
   /*
    * @new_data data to push to head of list
    */
   public void push(T new_data) {
      // 1. allocate node 
      // 2. put in the data
      Node<T> new_Node = new Node<T>(new_data);
  
      // 3. Make next of new node as head and previous as NULL
      new_Node.setNext(this.head);
      new_Node.setPrev(null);
  
      // 4. change prev of head node to new node
      if (this.head != null) {
         this.head.setPrev(new_Node);
      }
  
      // 5. move the head to point to the new node
      this.head = new_Node;
   }
   
   /*
    * @param prev_Node 
    */
   public void InsertAfter(Node<T> prev_Node, T new_data) {

      // 1. check if the given prev_node is NULL
      if (prev_Node == null) {
         System.out.println("The given previous node cannot be NULL ");
         return;
      }
      // 2. allocate node 
      // 3. put in the data
      Node<T> new_node = new Node<T>(new_data);
      // 4. Make node next to new node as next of prev_node
      new_node.setNext(prev_Node.getNext());
      // 5. Make the next of prev_node as new_node
      prev_Node.setNext(new_node);
      // 6. Make prev_node as previous of new_node
      new_node.setPrev(prev_Node);
      // 7. Change previous of new_node's next node
      if (new_node.getNext() != null) {
         new_node.getNext().setPrev(new_node);
      }
   }

   /*
    * @param new_data Add a node at the end of the list
    */
   void append(T new_data) {
      // 1. allocate node 
      // 2. put in the data
      Node<T> new_node = new Node<T>(new_data);
      //set "last" to the current head of list (will change if not null in
      //step 5
      Node<T> last = this.head;
      // 3. This new node is going to be the last node
      //so make next of it as NULL
      new_node.setNext(null);
      // 4. If the Linked List is empty, then make the new node as head
      if (this.head == null) {
         new_node.setPrev(null);
         this.head = new_node;
         return;
      } else {
      // 5. Else traverse till the last node
      while (last.getNext() != null) {
         last = last.getNext();
      }}
      // 6. Change the next of last node
      last.setNext(new_node);
      // 7. Make last node as previous of new node
      new_node.setPrev(last);
   }

   // This function prints contents of linked list starting from the given node
   public void printlist(Node<T> node) {
      Node<T> last = null;
      System.out.println("Traversal in forward Direction");
      while (node != null) {
         System.out.print(node.getData() + " ");
         last = node;
         node = node.getNext();
      }
      System.out.println();
      System.out.println("Traversal in reverse direction");
      while (last != null) {
         System.out.print(last.getData() + " ");
         last = last.getPrev();
      }
   }
   /*
    * override printlist to print the whole list
    */
   public void printlist() {
      //print whole list
      printlist(getHead());
   }
   /*
    * @return the head node
    */
      public Node<T> getHead(){
         return this.head;
      }
   }

