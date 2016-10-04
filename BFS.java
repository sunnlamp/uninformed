package uninformed;

import java.util.ArrayList;

public class BFS {

  ArrayList<Node> Path = new ArrayList<Node>();

  public void breadthFirstSearch(Node startNode, Node endNode) {
    ArrayList<Node> OpenList = new ArrayList<Node>();
    ArrayList<Node> ClosedList = new ArrayList<Node>();

    OpenList.add(startNode);

    while (OpenList.size() > 0) {

    }
  }

  public void depthFirstSearch(Node startNode, Node endNode) {

  }

  void backTrack(Node startNode, Node endNode) {
    Node n = endNode;

    while(n != startNode) {
      Path.add(n);
      n = n.parentNode;
    }

    Path.add(startNode); //appends the startNode to the Path list

    System.out.println("Path: ");
    for (int i = 0; i < Path.size(); i++) {
      System.out.println(Path.get(i).name);
    }
  }
  
}
