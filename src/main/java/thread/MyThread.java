package thread;

/**
 * @Description :
 * Created by WL on 2018/12/18
 */
public class MyThread implements Runnable {
    private Integer fid;
    private Integer groupId;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public void run() {

    }
}
