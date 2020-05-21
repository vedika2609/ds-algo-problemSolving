package dsalgo.datastructures.trees.binarytrees;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    private D data;
    private Tree<D> left;
    private Tree<D> right;

    NonEmptyBST(D element) {
        data = element;
        left = new EmptyBST();
        right = new EmptyBST();
    }

    private NonEmptyBST(D data, Tree<D> left, Tree<D> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D element) {
        if (data == element)
            return true;
        else {
            if (element.compareTo(data) < 0)
                return left.member(element);
            else
                return right.member(element);
        }
    }

    @Override
    public NonEmptyBST<D> add(D element) {
        if (data == element)
            return this;
        else {
            if (element.compareTo(data) < 0) {
                return new NonEmptyBST<>(data, left.add(element), right);
            } else
                return new NonEmptyBST<>(data, left, right.add(element));
        }
    }
}
