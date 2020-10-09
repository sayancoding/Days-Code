import java.util.Scanner;

class Main{
  static TreeNode root = null;
  static Scanner sc = null;
  
  static TreeNode createTree(){
    System.out.println("Enter the data..");
    int data = sc.nextInt();
    // -1 means doesn't want insert
    if(data == -1){
      return null;
    }
    TreeNode node = new TreeNode(data);
    
    System.out.println("left node of "+data);
    node.left = createTree();
    System.out.println("right node of "+data);
    node.right = createTree();
    
    return node; 
  }
  static void preOrder(TreeNode node){
    if(node == null) return ;
    System.out.print(node.data+" ");
    preOrder(node.left);
    preOrder(node.right);
  }
  static void inOrder(TreeNode node){
    if(node == null) return ;
    preOrder(node.left);
    System.out.print(node.data+" ");
    preOrder(node.right);
  }
  static void postOrder(TreeNode node){
    if(node == null) return ;
    preOrder(node.left);
    preOrder(node.right);
    System.out.print(node.data+" ");
  }

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    root = createTree();
    System.out.println("----preorder----");
    preOrder(root);
    System.out.println("----inorder----");
    inOrder(root);
    System.out.println("----postorder----");
    postOrder(root);
  }
}

class TreeNode{
  int data;
  TreeNode left,right;

  TreeNode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}