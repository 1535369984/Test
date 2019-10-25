import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException, Exception {

        // Map<Integer, Integer> t=new HashMap<Integer, Integer>();
        // // ID PID
        // t.put(1, 0);
        // t.put(2, 1);
        // t.put(3, 1);
        // t.put(4, 2);
        // t.put(5, 4);
        // Set<Integer> a=t.keySet();
        //
        // Iterator<Integer> i=a.iterator();
        // while (i.hasNext()) {
        // if (i.next()==2) {
        // i.remove();
        // }
        // }
        // Set<Integer> a1=t.keySet();
        // for (Integer integer : a1) {
        // System.out.println(integer);
        // }
        // int i=0;
        // for(;i<3;i++){
        // System.out.println(11);
        // }

        // int[] a = new int[10];
        // for (int i = 0; i < a.length; i++) {
        // a[i] = (int) (Math.random() * 100) + 1;
        // }
        /**
         * 冒泡排序
         */
        // for (int i = 0; i < a.length - 1; i++) {
        // for (int j = 0; j < a.length - i - 1; j++) {
        // if (a[j] > a[j + 1]) {
        // int temp = a[j + 1];
        // a[j + 1] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }
        /**
         * 选择排序
         */

        // 选择排序的优化
        // for(int i = 0; i < a.length - 1; i++) {// 做第i趟排序
        // int k = i;
        // for(int j = k + 1; j < a.length; j++){// 选最小的记录
        // if(a[j] < a[k]){
        // k = j; //记下目前找到的最小值所在的位置
        // }
        // }
        // //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
        // if(i != k){ //交换a[i]和a[k]
        // int temp = a[i];
        // a[i] = a[k];
        // a[k] = temp;
        // }
        // }
        // for (int i : a) {
        // System.out.println(i);
        // }
        // Stack<Integer> s = new Stack<>();
        // s.push(12);
        // s.push(10);
        // s.push(14);
        // System.err.println(s.peek());

        // 画菱形
        // int length = 5;
        // drawShape(length);
        // Object[] a = new Object[3];


//		List<Integer> t = new ArrayList<Integer>();
//		// ID PID
//		t.add(1);
//		t.add(2);
//		t.add(3);
//		t.add(4);
//		t.add(5);
//		Iterator<Integer> i = t.iterator();
//		while (i.hasNext()) {
//			System.err.println(i.next());
//			i.remove();
//		}
//		System.err.println(11);

//        String test="123Java456Java789Java";
//        Pattern pattern = Pattern.compile("Java");
//        String[] result = pattern.split(test);
//        for(String s : result)
//            System.out.println(s);

//        Pattern pattern = Pattern.compile("Java");
//        String test1 = "Java";
//        String test2 = "Java1234";
//        String test3 = "1234Java";
//        Matcher matcher = pattern.matcher(test1);
//        System.out.println(matcher.matches());//返回true
//        matcher = pattern.matcher(test2);
//        System.out.println(matcher.matches());//返回false
//
//        matcher = pattern.matcher(test2);
//        System.out.println(matcher.lookingAt());//返回true
//        matcher = pattern.matcher(test3);
//        System.out.println(matcher.lookingAt());//返回false
//
//        matcher = pattern.matcher(test1);
//        System.out.println(matcher.find());//返回true
//        matcher = pattern.matcher(test2);
//        System.out.println(matcher.find());//返回true
//        matcher = pattern.matcher(test3);
//        System.out.println(matcher.find(2));//返回true
//        matcher = pattern.matcher(test3);
//        System.out.println(matcher.find(5));//返回false
//        a.add()
//        for(int i = 0; i < 10; i++){
//            String a = "1560724650";
//            System.err.println(Math.abs(a.hashCode()));
//        }
//        Test1 test1 = new Test1();
//        test1.oddEevenDecision();
//        System.err.println(String.format("this is %s %d %f", "a", 10, 10f));
//        List<String> list = new ArrayList<String>();
//        for (int i = 0; i < 9; i++) {
//            for (int j = i + 1; j < 9; j++) {
//                String s = i + "|" + j;
//                list.add(s);
//            }
//        }
//        System.err.println(list.size());
//        list.stream().forEach(System.out::println);
//          Calendar calendar = Calendar.getInstance();
//        Date date = new Date();
//        System.err.println(calendar.get(Calendar.DAY_OF_MONTH));
//        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) , calendar.get(Calendar.DAY_OF_MONTH));
//        System.err.println(calendar.getTime());
//        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) , calendar.get(Calendar.DAY_OF_MONTH) + 1);
//        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
//        System.err.println(calendar.getTime());
//        System.err.println(calendar.get(Calendar.DATE));
/** 当hash码相同和equals为true */
//        User user = new User("王磊", 12);
//        User user1 = new User("王磊", 24);
//        HashMap<User, Integer> map = new HashMap<>();
//        map.put(user, user.getAge());
//        map.put(user1, user1.getAge());
//        map.keySet().stream().forEach(e -> {
//            System.err.println(e + "==" + map.get(e));
//        });
//        System.err.println(Calendar.getInstance().getTime());
    System.err.println(0x7fffffff);
    }

    public static void drawShape(int length) {
        for (int i = 0; i <= 2 * (length - 1); i += 2) {
            for (int j = 0; j < length - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = length - i / 2; j <= length + i / 2; j++) {
                if (j == length - i / 2 || j == length + i / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = 0; i <= 2 * (length - 2); i += 2) {
            for (int j = 0; j < i / 2 + 2; j++) {
                System.out.print(" ");
            }
            for (int j = i / 2 + 2; j <= 2 * length - (i / 2 + 2); j++) {
                if (j == i / 2 + 2 || j == 2 * length - (i / 2 + 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
