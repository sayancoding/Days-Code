class Main{
  int[] arr;
  int capacity,count,rear,front;
  Main(int capacity){
    arr = new int[capacity];
    this.capacity = capacity;
    count = 0;
    rear = -1;
    front = -1;
  }
  int size(){
    return count;
  }
  boolean isFull(){
    if(this.capacity == this.count)
      return true;
    return false;
  }
  boolean isEmpty(){
    if(this.size() == 0)
      return true;
    return false;
  }

  void enQueue(int element){
    if(isFull()){
      System.out.println("queue is full");
      return;
    }
    if(isEmpty()){
      front = rear = 0;
      arr[rear] = element;
      count++;
      return;
    }
    rear = (rear+1)%capacity;
    arr[rear] = element;
    count++;
  }
  void deQueue(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return;
    }
    front= (front+1)%capacity;
    count--;
  }
  int peek(){
    if(isEmpty()){
      return -1;
    }
    return arr[front];
  }

  public static void main(String[] args) {
    Main queue = new Main(3);
    queue.enQueue(2);
    queue.enQueue(1);
    queue.enQueue(9);
    queue.deQueue();
    queue.enQueue(12);
    System.out.println(queue.peek());
  }
}