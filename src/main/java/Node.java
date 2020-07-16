public class Node {
   int key;
   Node left, right, parent;

   public Node() {}

   public Node(int num) {
      key = num;
      left = null;
      right = null;
      parent = null;
   }
}
