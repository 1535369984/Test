import java.util.Arrays;

public class MyList<E> {

	private static final Integer DEFAULTCAPACITY = 2;
	private Integer capacity;
	private Object[] element;
	private Integer size;

	public MyList() {
		this.capacity = DEFAULTCAPACITY;
		this.element = new Object[capacity];
		this.size = 0;
	}

	public boolean add(E e) {
		// 需要扩展内存
 		if (size >= capacity) {
			capacity *= 2;
			Object[] a = new Object[capacity];
			for (int i = 0; i < element.length; i++) {
				a[i] = element[i];
			}
			this.element = a;
		}
		this.element[size] = e;
		size++;
		return true;
	}

	public int size() {
		return this.size;
	}

	public E get(int i) {
		return (E) this.element[i];
	}

	public boolean remove(int i) {
		if (i <= size) {
			// i到size的元素左移动
			for (int j = i; j < element.length-1; j++) {
				element[j] = element[j + 1];
			}
			element[size] = null;
			size--;
			
		}
		return true;
	}

	public static void main(String[] args) {
		MyList<Integer> my = new MyList<Integer>();
		my.add(0);
		my.add(1);
		
		my.add(2);
		my.add(3);
		
		my.add(4);
		my.add(5);
		my.remove(1);
		for (int i = 0; i < my.size; i++) {
			System.err.println(my.get(i));
		}
		System.err.println(my.size());
	}
}
