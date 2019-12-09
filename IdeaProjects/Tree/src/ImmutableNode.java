import java.util.Collection;
import java.util.function.Function;

class ImmutableNode<T extends  Number> implements Node<T> {

    public ImmutableNode(T value, ImmutableNode<T> parent, Function<ImmutableNode<T>, Collection<? extends Node<T>>> childrenConstructor){

    }


    public Node<T> getParent(){
        return parent;
    }

    public Collection<Node<T>> getChildren(){
        return children;
    }

    public void print(int indents){

    }

    T value;

    ImmutableNode<T> parent;

    Collection<Node<T>> children;
}
