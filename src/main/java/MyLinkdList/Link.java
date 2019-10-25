package MyLinkdList;

import java.util.LinkedList;

public class Link {
	private Integer id;
	private Double data;
	private Link next;

	public Link(Integer id, Double data) {
		super();
		this.id = id;
		this.data = data;
	}

	public Link() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getData() {
		return data;
	}

	public void setData(Double data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void show() {
		System.err.println("Link [id=" + id + ", data=" + data + "]");
	}

}
