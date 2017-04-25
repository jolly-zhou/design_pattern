package composite;

/**
 * Created by jolly on 2017/4/23.
 */
public interface Node {

    boolean add(Node parentNode);

    boolean remove();

    void display();

    boolean isLeaf();

    int level();

    Node parentNode();
}
