package trees;

import java.util.Iterator;
import java.util.List;

/**
 * @author Class
 * @version 1
 */
public interface ISearchTree<T extends Comparable<T>> extends Iterator<T> {

    // basic operations

    /**
     * @param element element to add
     * @return true if el was added, false otherwise
     */
    boolean add(T element);

    boolean contains(T... element);

    boolean addAll(T... element);

    boolean remove(T element);

    int size();

    boolean isEmpty();


    // fancy once
    List<T> inOrder();
    List<T> preOrder();
    List<T> postorder();
    int treeHeight();
}
