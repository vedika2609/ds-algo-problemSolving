package dsalgo.datastructures.trees.binarytrees;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    EmptyBST() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D element) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D element) {
        return new NonEmptyBST<>(element);
    }
}
