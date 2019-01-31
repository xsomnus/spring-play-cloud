package datastructure;

/**
 * @author somnus_xiawenye
 * @since 2019/1/31 0031 14:05
 */
public class DoubleLink<T> {

    private DNode<T> head;
    private int counts;


    public DoubleLink() {
        head = new DNode<>(null, null, null);
        head.prev = head.next = head;
        counts = 0;
    }


    public int size() {
        return counts;
    }

    public boolean isEmpty() {
        return counts == 0;
    }

    private DNode<T> getNode(int idx) {
        if (idx < 0 || idx >= counts) throw new IndexOutOfBoundsException();

        if (idx <= counts/2) {
            DNode<T> node = head.next;
            for (int i = 0; i < idx; i++) {
                node = node.next;
            }
            return node;
        }

        DNode<T> rnode = head.prev;
        int rindex = counts - idx - 1;
        for (int j = 0; j < rindex; j++) {
            rnode = rnode.prev;
        }
        return rnode;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public T getLast() {
        return getNode(counts - 1).value;
    }

    public void insert(int index, T t) {
        if (index == 0) {
            DNode<T> node = new DNode<>(t, head.prev, head.next);
            head.next.prev = node;
            head.next = node;
            counts++;
            return;
        }
        DNode<T> inode = getNode(index);
        DNode<T> tNode = new DNode<T>(t, inode.prev, inode.next);
        inode.prev.next = tNode;
        inode.next = tNode;
        counts++;
    }

    public void insertFirst(T t) {
        insert(0, t);
    }

    public void appendLast(T t) {
        DNode<T> node = new DNode<T>(t, head.prev, head);
        head.prev.next = node;
        head.prev = node;
        counts++;
    }

    public void del(int index) {
        DNode<T> inode = getNode(index);
        inode.prev.next = inode.next;
        inode.next.prev = inode.prev;
        inode = null;
        counts--;
    }


    public void deleteFirst() {
        del(0);
    }

    public void deleteLast() {
        del(counts - 1);
    }

    private class DNode<T> {
        private DNode prev;
        private DNode next;
        private T value;

        public DNode(T value,DNode prev, DNode next) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }



}
