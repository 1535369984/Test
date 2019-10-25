package MyLinkdList;

/**
 * @Description : 双向链表
 * Created by WL on 2018/1/23
 */
public class DdLink {
    private Integer data;
    private DdLink previous;
    private DdLink next;

    public DdLink() {
    }

    public DdLink(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DdLink getPrevious() {
        return previous;
    }

    public void setPrevious(DdLink previous) {
        this.previous = previous;
    }

    public DdLink getNext() {
        return next;
    }

    public void setNext(DdLink next) {
        this.next = next;
    }
}

