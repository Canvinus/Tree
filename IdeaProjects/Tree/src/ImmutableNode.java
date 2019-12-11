import java.util.Collection;
import java.util.function.Function;

class ImmutableNode<T extends  Number> implements Node<T> {

    public ImmutableNode(T value, ImmutableNode<T> parent, Collection<ImmutableNode<T>> childrenConstructor){

        this.value = value;

        this.parent = parent;

        this.children.addAll(childrenConstructor);
    }


    public Node<T> getParent(){
        return parent;
    }

    public Collection<Node<T>> getChildren(){
        return children;
    }

    public void print(int indents){

        for(int i = 0;i<indents;i++) {
            System.out.print(" ");
            System.out.println(this.getValue());
        }

    }

    public T getValue(){
        return  value;
    }

    T value;

    ImmutableNode<T> parent;

    Collection<Node<T>> children;
}
