package MyLinkdList;

import java.util.LinkedList;

public class LinkList {
    private Link first;

    public LinkList() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Integer id, Double data) {
        Link newLink = new Link(id, data);
//		System.err.println(newLink.hashCode());
        newLink.setNext(first);
//		if (first != null) {
//			System.err.println(first.hashCode());
//		} else {
//			System.err.println("NO1");
//		}
        first = newLink;
//		System.err.println(first.hashCode());
    }

    public Link deleteFirst() {
        Link temp = first;
        System.err.println(temp == first);
        first = first.getNext();

        return temp;
    }

    public void displayList() {
        System.err.println("showAll:");
        Link current = first;
        while (current != null) {
            current.show();
            current = current.getNext();
        }
        System.err.println();
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(22, 22.2);
        list.insertFirst(44, 44.4);
        list.insertFirst(66, 66.6);
        list.insertFirst(88, 88.8);
        list.displayList();
        Link o = null;
        while (!list.isEmpty()) {
            o = list.deleteFirst();
            System.err.print("删除：");
            o.show();
        }
        list.displayList();
    }
}
