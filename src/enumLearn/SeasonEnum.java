package enumLearn;

/**
 * @Description :
 * Created by WL on 2018/9/12
 */
public enum SeasonEnum {
    SPRING("春天"), SUMMER("夏天"), FALL("秋天"), WINTER("冬天");
    private final String name;

    private SeasonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.err.println(SeasonEnum.FALL.name());
        System.err.println(SeasonEnum.FALL.name);
        System.err.println(SeasonEnum.FALL.getName());
        System.err.println(SeasonEnum.FALL.getName().equals(SeasonEnum.FALL.name));
    }
}
