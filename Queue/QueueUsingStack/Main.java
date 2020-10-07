import java.util.*;

class Main{
  Stack<Integer> stack = new Stack<>();
  void enQueue(int element){
    stack.push(element);
  }
  void deQueue(){
    if(stack.size() == 1){
      stack.pop();
      return;
    }
    int temp = stack.peek();
    stack.pop();
    deQueue();
    stack.push(temp);

  }
  public static void main(String[] args) {
    Main queue = new Main();
    queue.enQueue(5);
    queue.enQueue(11);
    queue.enQueue(18);
    queue.deQueue();
    System.out.println(queue.stack);
  }
}