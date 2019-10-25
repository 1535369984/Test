import java.util.*;

/**
 * @Description :
 * Created by WL on 2018/11/9
 */
public class Title {
    public static void main(String[] args) {
        List<HashMap<String, Object>> list = new ArrayList<>();
        for (int i = 2500; i > 0; i -= 10) {
            chongzhi(i, 0, 0, i, list);
        }
//        timesShow(list);
//        baseShow(list);
//        lossShow(list);
//        totalShow(list);
//        restRMBShow(list);
        comprehensiveShow(list);
    }

    private static void comprehensiveShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::times)).sorted(Comparator.comparing(Title::loss)).sorted(Comparator.comparing(Title::base)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("======================================");
        });
    }

    private static void timesShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::times)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("===============================");
        });
    }

    private static void baseShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::base)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("================================");
        });
    }

    private static void lossShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::loss)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("========================================");
        });
    }

    private static void totalShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::total)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("=================================");
        });
    }

    private static void restRMBShow(List<HashMap<String, Object>> list) {
        list.stream().sorted(Comparator.comparing(Title::restRMB)).forEach(e -> {
            System.err.println("基数:" + e.get("base"));
            System.err.println("损失:" + e.get("loss"));
            System.err.println("次数:" + e.get("times"));
            System.err.println("总充值数:" + e.get("total"));
            System.err.println("剩余RMB:" + e.get("restRMB"));
            System.err.println("=======================================");
        });
    }

    private static Integer times(HashMap<String, Object> map) {
        return (Integer) map.get("times");
    }

    private static Double base(HashMap<String, Object> map) {
        return (Double) map.get("base");
    }

    private static Double loss(HashMap<String, Object> map) {
        return (Double) map.get("loss");
    }

    private static Double total(HashMap<String, Object> map) {
        return (Double) map.get("total");
    }

    private static Double restRMB(HashMap<String, Object> map) {
        return (Double) map.get("restRMB");
    }

    private static void chongzhi(double chongzhi, double total, int times, double base, List<HashMap<String, Object>> list) {
        times++;
        double yuanbao = 10 * chongzhi;
        double tongqian = yuanbao * 450 * 0.95;
        double restRMB = tongqian / 10000 * 2.05;
        total += chongzhi;
        if (total >= 10000) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("base", base);
            map.put("loss", base - restRMB);
            map.put("times", times);
            map.put("total", total);
            map.put("restRMB", restRMB);
            list.add(map);
            return;
        }
        if (times > 20) {
//            System.err.println("基数不够:" + base);
            return;
        }
        chongzhi(restRMB, total, times, base, list);
    }
}
