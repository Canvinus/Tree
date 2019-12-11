public class Main {
    public static void main(String[] args) {
        MutableNode<Integer> root = new MutableNode<>(10, null, null);
        MutableTree<Integer> tree = new MutableTree<>(root);

        root.addChild(new MutableNode<>(5, root, null));
        root.addChild(new MutableNode<>(10, root, null));
        root.addChild(new MutableNode<>(100, root, null));

        int i = 0;
        root.print(i);
        System.out.println();
        for(var child:root.getChildren()){
            child.print(i);
            i++;
        }
        tree.getMaxSum(root);
    }
}
