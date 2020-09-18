class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
class Stack{
  int size;
  Node head;
  Stack(){
    this.size = 1;
  }
  Stack(int size){
    this.size = size;
  };
  void insert(int data){
    int count = 1;
    if(head == null){
      head = new Node(data);
      return;
    }
    Node curr = head;
    while(curr.next != null){
      curr = curr.next;
      count++;
    }
    if(count < size)
    curr.next = new Node(data);
    else{
      System.out.println("Stack is now Overflow");
      return;
    }
  }
  void peek(){
    if(head == null){
      System.out.println("Empty stack");
      return;
    }
    Node curr = head;
    while(curr.next!=null){
      curr = curr.next;
    }
    System.out.println(curr.data);
  }
  void remove(){
    if(head == null){
      System.out.println("Stack underflow..");
      return;
    }
    if(head.next == null){
      head = null;
      return;
    }
    Node curr = head;
    while(curr.next.next != null){
      curr = curr.next;
    }
    curr.next = null;

  }
  void print(){
    if(head == null){
      return;
    }
    Node curr = head;
    while(curr != null){
      System.out.println(curr.data);
      curr = curr.next;
    }
  }
}
class Main{
  public static void main(String[] args) {
    Stack myStack = new Stack(2);
    myStack.insert(45);
    myStack.insert(85);
    myStack.peek();
    myStack.remove();
    myStack.remove();
    myStack.peek();
    myStack.remove();
  }
}