package trees;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Class
 * @version 1
 */
public class BinarySearchTree<T extends Comparable<T>> implements ISearchTree<T> {
    private TreeNode root;
    private int size;

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean addAll(T... element) {
        return false;
    }

    @Override
    public boolean contains(T... element) {
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public List<T> inOrder() {
        return null;
    }

    @Override
    public List<T> preOrder() {
        return null;
    }

    @Override
    public List<T> postorder() {
        return null;
    }

    @Override
    public int treeHeight() {
        return 0;
    }

    @Override
    public Iterator<T> iterator(){
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    private class TreeNode{
        private T data;
        private TreeNode left, right;

        private TreeNode(T data) {
            this(data, null, null);
        }

        public TreeNode(T data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
