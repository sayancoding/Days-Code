class Stack{
  int[] arr;
  int top = -1;
  int max = 0;

  Stack(int size){
    this.arr = new int[size];
    this.max = size;
  }

  public boolean isEmpty(){
    if(top == -1)
      return true;
    return false;
  }
  public int size(){
    return this.arr.length;
  }

  public void push(int data){
    if(top < max){
      arr[++top] = data;
    }else{
      System.out.println("Satck is on Overflow..");
    }
  }
  public void peek(){
    System.out.println(arr[top]);
  }
  public void pop(){
    if(top != -1){
      arr[top] = 0;
      --top;
    }else{
      System.out.println("Stack underflow..");
    }
  }

  public void check(){
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

class Main{
  public static void main(String[] args) {
    Stack myStack = new Stack(4);
    myStack.push(45);
    myStack.push(55);
    myStack.peek();
    myStack.pop();
  }
}