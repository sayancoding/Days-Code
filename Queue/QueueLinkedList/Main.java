class Node{
  int key;
  Node next;
  Node(int key){
    this.key = key;
    this.next = null;
  }
}
class Main {
  Node front,rear;
  int capacity,count;
  Main(int capacity){
    front = rear = null;
    this.capacity = capacity;
    count = 0;
  }
  boolean isFull(){
    if(capacity == count){
      return true;
    }
    return false;
  }
  boolean isEmpty(){
    if(front == null && rear == null){
      return true;
    }
    return false;
  }
  void enQueue(int key){
    if(isFull()){
      System.out.println("queue is full..");
      return;
    }
    if(isEmpty()){
      Node temp = new Node(key);
      front = rear = temp;
      count++;
      return;
    }
    Node temp = new Node(key);
    rear.next = temp;
    rear = temp;
    count++;
  }
  void deQueue(){
    if(isEmpty()){
      System.out.println("empty queue..");
      return;
    }
    front = front.next;
    if(front == null){
      rear = null;
    }
  }
  int peek(){
    if(isEmpty()){
      System.out.println("empty");
      return -1;
    }
    return front.key;
  }
  public static void main(String[] args) {
    Main queue = new Main(3);
    queue.enQueue(5);
    queue.enQueue(12);
    queue.enQueue(15);
    queue.enQueue(11);
    // queue.deQueue();
    // queue.deQueue();
    // queue.deQueue();
    System.out.println(queue.peek());
  }  
}
