import java.util.*;

class BST {
  // do not change this
  private Node root;
  private ArrayList<Integer> data;

  // DO NOT MODIFY THIS METHOD
  public BST() {
    root = null;
    data = new ArrayList<Integer>(0);
  }

  // DO NOT MODIFY THIS METHOD
  public ArrayList<Integer> getData() {
    return data;
  }

  // DO NOT MODIFY THIS METHOD
  public void inOrderTraversal() {
      inOrderTraversal(root);
  }

  // DO NOT MODIFY THIS METHOD
  private void inOrderTraversal(Node node) {
      if (node != null) {
          inOrderTraversal(node.left);
          data.add(node.key);
          inOrderTraversal(node.right);
      }
  }

  // search
  public boolean search(int target) {
    // remove this line
    return false;
  }

  // insert
  public Node insert(int target) {
    // remove this line
    return root;
  }

  // note: you may need to implement several supporting methods for delete
  public Node delete(int target) {
    // remove this line
    return root;
  }

  // you are welcome to add any supporting methods
}
