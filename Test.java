package uninformed;

public class Test {
  public static void main(String[] args) {
    Node A = new Node("A");
    Node B = new Node("B");
    Node C = new Node("C");
    Node D = new Node("D");
    Node E = new Node("E");
    Node F = new Node("F");
    Node G = new Node("G");

    A.adjacents.add(B);
    A.adjacents.add(C);

    B.adjacents.add(D);
    B.adjacents.add(E);

    C.adjacents.add(F);
    C.adjacents.add(G);

    BFS bfs = new BFS();

    bfs.breadthFirstSearch(A, G);
    bfs.depthFirstSearch(A, F);
  }
}
