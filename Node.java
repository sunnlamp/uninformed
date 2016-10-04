package uninformed;

import java.util.ArrayList;

public class Node {

  String name;

  Node parentNode;

  ArrayList<Node> adjacents = new ArrayList<Node>();

  public Node(String n) {
    this.name = n;
    this.parentNode = null;
  }
}
