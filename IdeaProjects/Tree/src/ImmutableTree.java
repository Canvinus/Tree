public class ImmutableTree<T extends Number> extends AbstractTree<T> {

    ImmutableTree<T> removeSubtree(Node<T> rootSubTree);

    ImmutableTree<T> maximize(int k);

    ImmutableTree<T> maximize();

}
