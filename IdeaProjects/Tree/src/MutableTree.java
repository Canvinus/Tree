import java.util.Comparator;
import java.util.HashMap;
import java.util.function.BinaryOperator;

class MutableTree<T extends Number> extends AbstractTree<T> {

    MutableTree(MutableNode<T> root){

        this.root = root;
        adder = (a,b) -> a+b;
    }

    MutableNode<T> getRoot(){
        return root;
    }

    int getSize(){
        return root.getChildren().size();
    }

    MutableTree<T> removeSubtree(Node<T> rootSubTree){
        if(getRoot().children.contains(rootSubTree)){
            for(var child:rootSubTree.getChildren())
                root.removeChild((MutableNode<T>)child);
        }
        return this;
    }

    MutableTree<T> maximize(int k){
        return null;
    }

    MutableTree<T> maximize(){
        return null;
    }

    // method returns maximum sum possible from subtrees rooted
    // at grandChildrens of node 'node'
    T sumOfGrandChildren(MutableNode<T> node, HashMap<MutableNode<T>, T> mp)
    {
        sum = zero;
        //  call for children of left child only if it is not NULL
        if (node.getChildren()!=null) {
            for(Node<T> child : node.getChildren()){
                for(Node<T> childz: child.getChildren())
                    sum = adder.apply(sum, getMaxSumUtil((MutableNode<T>)childz, mp));
            }
        }
        return sum;
    }

    //  Utility method to return maximum sum rooted at node 'node'
    T getMaxSumUtil(MutableNode<T> node, HashMap<MutableNode<T>, T> mp)
    {
        if (node == null)
            return zero;

        // If node is already processed then return calculated
        // value from map
        if(mp.containsKey(node))
            return mp.get(node);

        //  take current node value and call for all grand children
        T incl = adder.apply(node.getValue(), sumOfGrandChildren(node, mp));

        //  don't take current node value and call for all children
        T excl = zero;
        for(Node<T> child:node.getChildren())
            excl = adder.apply(excl, getMaxSumUtil((MutableNode<T>) child, mp));

        int tzt = comparator.compare(incl, excl);
        //  choose maximum from both above calls and store that in map
        if(tzt == 0)
            mp.put(node,incl);
        else
            mp.put(node, excl);

        return mp.get(node);
    }

    // Returns maximum sum from subset of nodes
    // of binary tree under given constraints
    T getMaxSum(MutableNode<T> node)
    {
        if (node == null)
            return null;
        HashMap<MutableNode<T>,T> mp=new HashMap<>();
        return getMaxSumUtil(node, mp);
    }

    MutableNode<T> root;
}
