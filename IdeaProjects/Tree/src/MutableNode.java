import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class MutableNode<T extends Number> implements Node<T> {

    public MutableNode(T value, MutableNode<T> parent, Collection<MutableNode<T>> children){

        this.setValue(value);
        this.setParent(parent);
        if(children == null)
            this.children = new ArrayList<>();
        else
            this.setChildren(children);
    }

    void setValue(T value){
        this.value = value;
    }

    void setParent(MutableNode<T> parent){
        this.parent = parent;
    }

    void setChildren(Collection<MutableNode<T>> children){
        this.children.clear();
        this.children.addAll(children);
    }

    void addChild(MutableNode<T> child){
        this.children.add(child);
    }

    void removeChild(MutableNode<T> child){
        this.children.remove(child);
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
        }
        System.out.print(this.getValue());

    }

    public T getValue(){
        return  value;
    }

    T value;

    MutableNode<T> parent;

    Collection<Node<T>> children = new ArrayList<>();
}
