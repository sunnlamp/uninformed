package uninformed;

import java.util.ArrayList;

public class BFS {

  ArrayList<Node> path = new ArrayList<Node>();

  public void breadthFirstSearch(Node startNode, Node endNode) {
    ArrayList<Node> openList = new ArrayList<Node>();
    ArrayList<Node> closedList = new ArrayList<Node>();

    openList.add(startNode);
    Node currNode;

    while (openList.size() > 0) {
      currNode = openList.get(0);
      closedList.add(currNode);
      openList.remove(0);

      if (currNode.adjacents.size() > 0) {
        for (int i = 0; i < currNode.adjacents.size(); i++) {
          currNode.adjacents.get(i).parentNode = currNode;
          openList.add(currNode.adjacents.get(i));
          if (currNode.adjacents.get(i) == endNode) {
            backTrack(startNode, endNode);
          }
        }
      }
    }

  }

  public void depthFirstSearch(Node startNode, Node endNode) {
    ArrayList<Node> openList = new ArrayList<Node>();

    openList.add(startNode);
    Node currNode;

    while (openList.size() > 0) {
      currNode = openList.get(openList.size() - 1);
      openList.remove(openList.size() - 1);
      if (currNode.adjacents.size() > 0) {
        for (int i = 0; i < currNode.adjacents.size(); i++) {
          currNode.adjacents.get(i).parentNode = currNode;
          if (currNode.adjacents.get(i) == endNode) {
            backTrack(startNode, endNode);
            return;
          }
          openList.add(currNode.adjacents.get(i));
        }
      }
    }
  }

  void backTrack(Node startNode, Node endNode) {
    Node n = endNode;

    while(n != startNode) {
      path.add(n);
      n = n.parentNode;
    }

    path.add(startNode); //appends the startNode to the Path list

    System.out.println("Path: ");
    for (int i = 0; i < path.size(); i++) {
      System.out.println(path.get(i).name);
    }
  }

}
