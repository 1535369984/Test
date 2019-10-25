package MyLinkdList;

import java.util.Stack;

/**
 * @Description : 双端链表
 * Created by WL on 2018/1/23
 */
public class DLink {
    private Long dData;
    private DLink next;

    public DLink() {
    }

    public DLink(Long dData) {
        this.dData = dData;
    }

    public DLink(Long dData, DLink link) {
        this.dData = dData;
        this.next = link;
    }

    @Override
    public String toString() {
        return this.dData.toString();
    }

    public Long getdData() {
        return dData;
    }

    public void setdData(long dData) {
        this.dData = dData;
    }

    public DLink getNext() {
        return next;
    }

    public void setNext(DLink next) {
        this.next = next;
    }

}

class FirstLastList {
    private DLink first;
    private DLink last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Long dd) {
        DLink newLink = new DLink(dd);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.setNext(first);
        first = newLink;
    }

    public void insertLast(Long dd) {
        DLink newLink = new DLink(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.setNext(newLink);
        }
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.getdData();
        if (first.getNext() == null) {
            last = null;
        }
        first = first.getNext();
        return temp;
    }

    public void displayList() {
        System.err.println("List(first-->last)");
        DLink current = first;
        while (current != null) {
            System.err.println(current.toString());
            current = current.getNext();
        }
        System.err.println("");
    }

    public static void main(String[] args) {
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22L);
        theList.insertFirst(44l);
        theList.insertFirst(66L);
        theList.insertLast(11L);
        theList.insertLast(33L);
        theList.insertLast(55L);
        theList.displayList();
    }
}
