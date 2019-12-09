import java.util.Collection;

class MutableNode<T extends Number> implements Node<T> {

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

    }

    public T getValue(){
        return  value;
    }

    T value;

    MutableNode<T> parent;

    Collection<Node<T>> children;
}
