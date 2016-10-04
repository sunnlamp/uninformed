package uninformed;

import java.util.ArrayList;

public class BFS {

  ArrayList<Node> Path = new ArrayList<Node>();

  public void breadthFirstSearch(Node startNode, Node endNode) {
    ArrayList<Node> OpenList = new ArrayList<Node>();
    ArrayList<Node> ClosedList = new ArrayList<Node>();

    OpenList.add(startNode);
    Node currNode;

    while (OpenList.size() > 0) {
      currNode = OpenList.get(0);
      ClosedList.add(currNode);
      OpenList.remove(0);

      if (currNode.adjacents.size() > 0) {
        for (int i = 0; i < currNode.adjacents.size(); i++) {
          currNode.adjacents.get(i).parentNode = currNode;
          OpenList.add(currNode.adjacents.get(i));
          if (currNode.adjacents.get(i) == endNode) {
            backTrack(startNode, endNode);
          }
        }
      }

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
