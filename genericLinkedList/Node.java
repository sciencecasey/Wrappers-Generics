package genericLinkedList;

/*
 * @author Geeks4Geeks modified to generic by Casey Jayne
 * create a generic type of node
 */
class Node <T>{
   //save data stored in node
   private T data;
   //create another node item labeled as the previous link
   private Node<T> prev;
   //third node item labeled as next link
   private Node<T> next;
   
   /*
    * @param data set the data within the node
    * next and prev is by default initialized as null
    */
   Node(T data) {
      setData(data);
   }
   Node(){
      System.out.println("No data input");
      setData(null);
   }
   
   /*
    * @return T get data in this node
    */
   public T getData() {
      return this.data;
   }
   /*
    * @param data set data in the node
    */
   public void setData(T data) {
      this.data = data;
   }
   
   /*
    * @return the node associated with previous node
    */
   public Node<T> getPrev() {
      return this.prev;
   }
   
   /*
    * @param prev set the previous node
    */
   public void setPrev(Node<T> prev) {
      this.prev = prev;
   }
   
   /*
    * @return the next node
    */
   public Node<T> getNext() {
      return this.next;
   }
   
   /*
    * @param next set next node
    */
   public void setNext(Node<T> head) {
      this.next = head;
   }
}
 