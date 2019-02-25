package chessknight;

import java.util.Objects;

public class Node {
    // (x, y) represents chess board coordinates
    // dist represent its minimum distance from the source
    int x,y,dist;

    public Node(int x, int y){
        this.x= x;
        this.y = y;
    }

    public Node(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }

    // As we are using class object as a key in a HashMap
    // we need to implement hashCode() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return x == node.x &&
                y == node.y &&
                dist == node.dist;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, dist);
    }
}
