import java.util.Comparator;
import java.util.function.BinaryOperator;

abstract class AbstractTree<T extends Number> {

    Node<T> getRoot(){
        return root;
    }

    int getSize(){
        return root.getChildren().size();
    }

    T getSum(){
        return null;
    }

    abstract AbstractTree<T> removeSubtree(Node<T> rootSubTree);

    abstract AbstractTree<T> maximize(int k);

    abstract AbstractTree<T> maximize();

    Node<T> root;

    BinaryOperator<T> adder;

    T sum;

    Comparator<T> comparator;

    T zero;
}
